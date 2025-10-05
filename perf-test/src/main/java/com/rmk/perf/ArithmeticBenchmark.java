package com.rmk.perf;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class ArithmeticBenchmark {

    private int intValue1 = 100;
    private int intValue2 = 200;
    private long longValue1 = 100L;
    private long longValue2 = 200L;

    @Benchmark
    public int testIntAddition() {
        return intValue1 + intValue2;
    }

    @Benchmark
    public int testIntSubtraction() {
        return intValue2 - intValue1;
    }

    @Benchmark
    public int testIntMultiplication() {
        return intValue1 * intValue2;
    }

    @Benchmark
    public int testIntDivision() {
        return intValue2 / intValue1;
    }

    @Benchmark
    public long testLongAddition() {
        return longValue1 + longValue2;
    }

    @Benchmark
    public long testLongSubtraction() {
        return longValue2 - longValue1;
    }

    @Benchmark
    public long testLongMultiplication() {
        return longValue1 * longValue2;
    }

    @Benchmark
    public long testLongDivision() {
        return longValue2 / longValue1;
    }
}