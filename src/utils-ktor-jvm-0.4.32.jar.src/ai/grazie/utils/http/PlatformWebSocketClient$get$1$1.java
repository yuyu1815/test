/*    */ package ai.grazie.utils.http;
/*    */ import io.ktor.client.plugins.websocket.WebSockets;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nPlatformWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformWebSocketClient.kt\nai/grazie/utils/http/PlatformWebSocketClient$get$1$1\n+ 2 Durations.kt\nio/ktor/client/plugins/websocket/DurationsKt\n*L\n1#1,17:1\n47#2,2:18\n*S KotlinDebug\n*F\n+ 1 PlatformWebSocketClient.kt\nai/grazie/utils/http/PlatformWebSocketClient$get$1$1\n*L\n12#1:18,2\n*E\n"})
/*    */ final class null extends Lambda implements Function1<WebSockets.Config, Unit> {
/*    */   public final void invoke(WebSockets.Config $this$install) {
/* 12 */     Intrinsics.checkNotNullParameter($this$install, "$this$install"); WebSockets.Config config = $this$install; long l = DurationKt.toDuration(30, DurationUnit.SECONDS); int $i$f$setPingInterval-6Au4x4Y = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     config.setPingIntervalMillis(Duration.getInWholeMilliseconds-impl(l));
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\PlatformWebSocketClient$get$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */