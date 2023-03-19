class ReverseNumber
{
    int r;
    
    ReverseNumber() {
        this.r = 0;
    }
    
    int rev(int i) {
        while (i > 0) {
            this.r = this.r * 10 + i % 10;
            i /= 10;
        }
        return this.r;
    }
}