/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/KtorWebSocketClient;", "invoke"})
/*    */ final class KtorWebSocketClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<KtorWebSocketClient> {
/*    */   public static final KtorWebSocketClient$Client$WithExtendedTimeout$2 INSTANCE = new KtorWebSocketClient$Client$WithExtendedTimeout$2();
/*    */   
/*    */   KtorWebSocketClient$Client$WithExtendedTimeout$2() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final KtorWebSocketClient invoke() {
/* 16 */     return KtorWebSocketClient.Companion.withExtendedTimeout(PlatformWebSocketClient.INSTANCE.get());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$Client$WithExtendedTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */