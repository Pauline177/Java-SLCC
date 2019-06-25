// * Name: Pauline Makoma.
// * Assignment: Triangle

package com.company;
public class Triangle {

        private double side1;
        private double side2;
        private double side3;

        public Triangle(double s1, double s2,double s3){
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }

        public double getSide1(){
            return side1 ;
        }
        public double getSide2(){
            return side2 ;
        }
        public double getSide3(){
            return side3 ;
        }

        private boolean isTriangle(double side1, double side2, double side3){

            if (isEquilateral() == true || isRight() == true){
                return true;
            } else {
                return false;
            }

        }

        public boolean isEquilateral () {
            if (side1 > 0 && side2 > 0 && side3 > 0) {
                if (side1 == side2 && side2 == side3) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;

            }
        }

        public boolean isRight() {
            double pow1 = Math.pow(side1, 2);
            double pow2 = Math.pow(side2, 2);
            double pow3 = Math.pow(side3, 2);

            if (side1 > 0 && side2 > 0 && side3 > 0) {
                if (Math.pow((pow1 + pow2), 0.5) == side3 ||
                        Math.pow((pow1 + pow3), 0.5) == side2 ||
                        Math.pow((pow3 + pow2), 0.5) == side1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        }



