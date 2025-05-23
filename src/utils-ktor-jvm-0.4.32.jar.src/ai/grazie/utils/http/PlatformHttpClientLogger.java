/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lai/grazie/utils/http/PlatformHttpClientLogger;", "Lio/ktor/client/plugins/logging/Logger;", "prefix", "", "(Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "log", "", "message", "utils-ktor"})
/*    */ public final class PlatformHttpClientLogger implements Logger {
/*  8 */   public PlatformHttpClientLogger(@NotNull String prefix) { this.prefix = prefix; } @NotNull private final String prefix; @NotNull public final String getPrefix() { return this.prefix; }
/*    */   
/* 10 */   public void log(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); PlatformHttpClientLoggerKt.getLogger().info(new PlatformHttpClientLogger$log$1(message)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class PlatformHttpClientLogger$log$1 extends Lambda implements Function0<String> { public final String invoke() { return PlatformHttpClientLogger.this.getPrefix() + ": " + PlatformHttpClientLogger.this.getPrefix(); }
/*    */ 
/*    */     
/*    */     PlatformHttpClientLogger$log$1(String $message) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\PlatformHttpClientLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */