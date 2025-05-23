/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.http.HeadersBuilder;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/http/HeadersBuilder;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<HeadersBuilder, Unit>
/*    */ {
/*    */   public final void invoke(HeadersBuilder $this$headers) {
/* 44 */     Intrinsics.checkNotNullParameter($this$headers, "$this$headers"); for (Map.Entry<String, String> entry : this.$headers.entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue();
/* 45 */       $this$headers.append(key, value); }
/*    */   
/*    */   }
/*    */   
/*    */   null(Map<String, String> $headers) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$connect$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */