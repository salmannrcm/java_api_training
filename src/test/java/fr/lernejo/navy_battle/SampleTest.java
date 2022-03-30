package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest
{
    @Test
    void fact_3_should_be_6()
    {   //Given
        int n = 3;
        Sample sample = new Sample();

        //When
        int result = sample.fact(n);

        //Then
        Assertions.assertThat(result).isEqualTo(6);
    }
    @Test
    void fact_of_negative_number_throws()
    {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Sample().fact(-1));
    }

    @Test
    void add_of_positive()
    {
        int a = 3;
        int b = 3;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(res).isEqualTo(6);
    }
    @Test
    void add_of_pos_and_neg()
    {
        int a = 3;
        int b = -3;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(res).isEqualTo(0);
    }
    @Test
    void div_of_pos()
    {
        int a = 4;
        int b = 2;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.DIV,a,b);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void div_of_pos_and_neg()
    {
        int a = 4;
        int b = -2;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(res).isEqualTo(-2);
    }
    @Test
    void POW_of_pos()
    {
        int a = 3;
        int b = -3;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.POW,a,b);
        Assertions.assertThat(res).isEqualTo(9);
    }
    @Test
    void div_of_neg()
    {
        int a = -3;
        int b = -3;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.DIV,a,b);
        Assertions.assertThat(res).isEqualTo(1);
    }
    @Test
    void mult_of_pos_and_neg()
    {
        int a = 3;
        int b = -3;
        Sample sample = new Sample();
        int res = sample.op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(res).isEqualTo(-9);
    }
}
