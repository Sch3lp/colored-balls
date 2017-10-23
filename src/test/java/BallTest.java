import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BallTest {

    @Test
    public void ballWithParameterBlue_shouldReturnBlueBall() throws Exception {
        Ball blue = Ball.getInstance("blue");
        assertThat(blue.getColor()).isEqualTo("blue");
    }

    @Test
    public void anotherBallWithParameterBlue_shouldReturnSameBlueBall() throws Exception {
        Ball blueBall = Ball.getInstance("blue");
        Ball secondBlueBall = Ball.getInstance("blue");

        assertThat(blueBall).isSameAs(secondBlueBall); // blueBall == secondBlueBall
        assertThat(blueBall.getColor()).isSameAs("blue");
        assertThat(secondBlueBall.getColor()).isSameAs("blue");
    }

    @Test
    public void anotherBallWithParameterRed_shouldReturnRedBall() throws Exception {
        Ball blueBall = Ball.getInstance("blue");
        Ball redBall = Ball.getInstance("red");
        Ball secondRedBall = Ball.getInstance("red");

        assertThat(redBall.getColor()).isEqualTo("red");
        assertThat(blueBall).isNotSameAs(redBall); // blueBall != redBall
        assertThat(secondRedBall).isSameAs(redBall); // secondRedBall == redBall
    }

    @Test
    public void yetAnotherBallWithParameterYellow_shouldReturnYellowBall() throws Exception {
        Ball blueBall = Ball.getInstance("blue");
        Ball redBall = Ball.getInstance("red");
        Ball yellowBall = Ball.getInstance("yellow");

        assertThat(blueBall.getColor()).isEqualTo("blue");
        assertThat(redBall.getColor()).isEqualTo("red");
        assertThat(yellowBall.getColor()).isEqualTo("yellow");
        
        assertThat(blueBall).isNotSameAs(redBall);
        assertThat(yellowBall).isNotSameAs(redBall);
        assertThat(yellowBall).isNotSameAs(blueBall);
    }
}
