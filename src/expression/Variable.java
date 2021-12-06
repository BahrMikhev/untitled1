package expression;

public class Variable extends Monom implements MyExpression {

    public Variable(String x) {
        super(x);
        super.tag = "V";
    }

    @Override
    public int hashCode() {
        return super.x.charAt(0) * 7373;
    }

    @Override
    public int evaluate(int x) {
        return x;
    }

    @Override
    public String toString() {
        return this.x;
    }

}
