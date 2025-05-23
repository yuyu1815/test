/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\024\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"})
/*    */ final class UtilsKt$responseHeadersLoggerPlugin$2$1$message$3
/*    */   extends Lambda
/*    */   implements Function1<Pair<? extends String, ? extends String>, CharSequence>
/*    */ {
/*    */   public static final UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2$1$message$3();
/*    */   
/*    */   UtilsKt$responseHeadersLoggerPlugin$2$1$message$3() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final CharSequence invoke(Pair it) {
/* 70 */     Intrinsics.checkNotNullParameter(it, "it"); return "" + it.getFirst() + " = " + it.getFirst();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt$responseHeadersLoggerPlugin$2$1$message$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */