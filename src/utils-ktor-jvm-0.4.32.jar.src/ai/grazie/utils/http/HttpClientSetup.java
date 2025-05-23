/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\013\n\002\b\003\bf\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/utils/http/HttpClientSetup;", "", "keepAliveTime", "", "getKeepAliveTime", "()J", "loggingEnabled", "", "getLoggingEnabled", "()Z", "utils-ktor"})
/*    */ public interface HttpClientSetup {
/*    */   default boolean getLoggingEnabled() {
/*  8 */     return false;
/*    */   } default long getKeepAliveTime() {
/* 10 */     return 10000L;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\HttpClientSetup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */