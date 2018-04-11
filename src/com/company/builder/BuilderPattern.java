package com.company.builder;

public class BuilderPattern {
    public String getDish() {
        return dish;
    }

    public String getBread() {
        return bread;
    }

    public String getDressing() {
        return dressing;
    }

    private final String dish;
    private final String bread;
    private final String dressing;

    public static class Builder {
        private String dish;
        private String bread;
        private String dressing;

        public Builder dish(String newDish){
            dish = newDish;
            return this;
        }
        public Builder bread(String newBread){
            bread = newBread;
            return this;
        }
        public Builder dressing(String newDressing){
            dressing = newDressing;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }

    }

    private BuilderPattern(Builder builder) {
        dressing = builder.dressing;
        bread = builder.bread;
        dish = builder.dish;
    }
}
