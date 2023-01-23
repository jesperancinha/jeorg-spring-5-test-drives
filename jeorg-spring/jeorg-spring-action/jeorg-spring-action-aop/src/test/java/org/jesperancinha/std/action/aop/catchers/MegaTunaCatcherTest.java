package org.jesperancinha.std.action.aop.catchers;

import org.aspectj.lang.JoinPoint;
import org.jesperancinha.std.action.aop.aspects.TunaAspect;
import org.jesperancinha.std.action.aop.beans.Bonito4Service;
import org.jesperancinha.std.action.aop.beans.TunaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = {
        MegaTunaCatcher.class,
        TunaAspect.class
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
class MegaTunaCatcherTest {

    @MockBean
    private TunaService tunaService;

    @MockBean
    private Bonito4Service bonito4Service;

    @Autowired
    private MegaTunaCatcher megaTunaCatcher;

    @Captor
    private ArgumentCaptor<JoinPoint> joinPointArgumentCaptor;

    @Test
    void catchWithNet() {
        megaTunaCatcher.catchWithNet();

        verify(tunaService, only()).beforeCatching(joinPointArgumentCaptor.capture());
        final var joinPointArgumentCaptorValue = joinPointArgumentCaptor.getValue();
        assertThat(joinPointArgumentCaptorValue.getSignature().toString())
                .isEqualTo("Tuna org.jesperancinha.std.action.aop.catchers.MegaTunaCatcher.catchWithNet()");
        verifyNoInteractions(bonito4Service);
    }

    @Test
    void catchWithFishingPole() {
    }

    @Test
    void catchByHand() {
    }

    @Test
    void catchByHandExtra() {
    }

    @Test
    void catchWithClaws() {
    }

    @Test
    void catchWithSuperSonicWaves() {
    }

    @Test
    void catchWithABucket() {
    }

    @Test
    void catchWithLove() {
    }
}