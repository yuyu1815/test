/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.model.cloud.exceptions.HTTPStatusException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\002\b\003\n\002\020\003\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Client", "T", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"})
/*    */ final class ExtensionsKt$withHttpBackoff$2
/*    */   extends Lambda
/*    */   implements Function1<Throwable, Boolean>
/*    */ {
/*    */   public static final ExtensionsKt$withHttpBackoff$2 INSTANCE = new ExtensionsKt$withHttpBackoff$2();
/*    */   
/*    */   public final Boolean invoke(Throwable it) {
/* 60 */     Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((it instanceof HTTPStatusException && (((HTTPStatusException)it).isServerError() || it instanceof HTTPStatusException.TooManyRequests)));
/*    */   }
/*    */   
/*    */   ExtensionsKt$withHttpBackoff$2() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\ExtensionsKt$withHttpBackoff$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */