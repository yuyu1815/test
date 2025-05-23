/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.utils.http.PlatformHttpClient;
/*    */ import ai.grazie.utils.http.UtilsKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"})
/*    */ final class GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2
/*    */   extends Lambda
/*    */   implements Function0<GrazieKtorHTTPClient>
/*    */ {
/*    */   public static final GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2();
/*    */   
/*    */   GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final GrazieKtorHTTPClient invoke() {
/* 45 */     return new GrazieKtorHTTPClient(UtilsKt.withOneMinuteTimeout(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "WithOneMinuteTimeout", null, 2, null)), null, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */