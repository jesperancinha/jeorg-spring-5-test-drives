package org.jesperancinha.std.flash22.interceptors;

import org.jesperancinha.std.flash22.interceptors.beans.FeelingLoveBean;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = SpringFlash22Launcher.class)
class SpringFlash22LauncherITTest {

    @Autowired
    private MockMvc mockMvc;

    @SpyBean
    private FeelingLoveBean feelingLoveBean;

    @Captor
    private ArgumentCaptor<Object> objectArgumentCaptor;

    @Captor
    private ArgumentCaptor<ModelAndView> modelAndViewArgumentCaptor;

    @Captor
    private ArgumentCaptor<Exception> exceptionArgumentCaptor;

    @Test
    void main() {
    }

    @Test
    void testGetString_whenCalled_thenTriggerInterceptors() throws Exception {
        when(feelingLoveBean.preHandle(any(Object.class))).thenReturn(true);

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Fine Wine"));

        verify(feelingLoveBean, times(1)).preHandle(objectArgumentCaptor.capture());
        verify(feelingLoveBean, times(1)).postHandle(objectArgumentCaptor.capture(), modelAndViewArgumentCaptor.capture());
        verify(feelingLoveBean, times(1)).afterCompletion(objectArgumentCaptor.capture(), exceptionArgumentCaptor.capture());

        final List<Object> allValues = objectArgumentCaptor.getAllValues();
        assertThat(allValues).hasSize(3);
        allValues.forEach(value ->
                assertThat(value.toString()).isEqualTo("org.jesperancinha.std.flash22.interceptors.SpringFlash22Launcher#getString()"));
        final ModelAndView value = modelAndViewArgumentCaptor.getValue();
        assertThat(value).isNull();
        final Exception exception = exceptionArgumentCaptor.getValue();
        assertThat(exception).isNull();

    }
}