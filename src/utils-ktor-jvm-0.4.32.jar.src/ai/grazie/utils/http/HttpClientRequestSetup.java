/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\020\t\n\002\b\003\bf\030\0002\0020\001R\032\020\002\032\b\022\004\022\0020\0040\0038VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lai/grazie/utils/http/HttpClientRequestSetup;", "", "capturedResponseHeaders", "", "", "getCapturedResponseHeaders", "()Ljava/util/List;", "sseSocketTimeout", "", "getSseSocketTimeout", "()J", "utils-ktor"})
/*    */ public interface HttpClientRequestSetup
/*    */ {
/*    */   default long getSseSocketTimeout() {
/* 18 */     return 60000L; } @NotNull
/*    */   default List<String> getCapturedResponseHeaders() {
/* 20 */     return CollectionsKt.emptyList();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\HttpClientRequestSetup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */