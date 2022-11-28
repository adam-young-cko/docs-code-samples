import com.checkout.CheckoutApi;
import com.checkout.CheckoutSdk;
import com.checkout.Environment;
import com.checkout.common.Currency;
import com.checkout.payments.request.PaymentRequest;
import com.checkout.payments.request.source.RequestTokenSource;

public class Server {
    public static void main(String[] args) {
        CheckoutApi checkoutApi = CheckoutSdk.builder()
                .staticKeys()
                .secretKey("sk_sbox_XXX")
                .environment(Environment.SANDBOX)
                .build();

        // The token generated by Frames on the Front End
        RequestTokenSource requestTokenSource = RequestTokenSource.builder()
                .token("tok_XXX")
                .build();

        PaymentRequest paymentRequest = PaymentRequest.builder()
                .source(requestTokenSource)
                .amount((long) 24.99)
                .currency(Currency.GBP)
                .processingChannelId("pc_XXX")
                .build();

        checkoutApi.paymentsClient().requestPayment(paymentRequest);
    }
}