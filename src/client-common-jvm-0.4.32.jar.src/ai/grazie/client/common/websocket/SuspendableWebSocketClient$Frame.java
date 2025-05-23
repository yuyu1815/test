/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\n\b\026\030\0002\0020\001:\004\013\f\r\016B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "", "type", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "data", "", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;[B)V", "getData", "()[B", "getType", "()Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "Binary", "Close", "Text", "Type", "client-common"})
/*    */ public class Frame
/*    */ {
/*    */   @NotNull
/*    */   private final Type type;
/*    */   @NotNull
/*    */   private final byte[] data;
/*    */   
/*    */   public Frame(@NotNull Type type, @NotNull byte[] data) {
/* 17 */     this.type = type; this.data = data; } @NotNull public final Type getType() { return this.type; } @NotNull public final byte[] getData() { return this.data; }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "", "(Ljava/lang/String;I)V", "BINARY", "TEXT", "CLOSE", "client-common"})
/* 19 */   public enum Type { BINARY,
/* 20 */     TEXT,
/* 21 */     CLOSE; }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "()V", "client-common"})
/* 24 */   public static final class Close extends Frame { public Close() { super(SuspendableWebSocketClient.Frame.Type.CLOSE, new byte[0]); } }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "client-common"})
/* 26 */   public static final class Text extends Frame { public Text(@NotNull String text) { super(SuspendableWebSocketClient.Frame.Type.TEXT, StringsKt.encodeToByteArray(text)); this.text = text; } @NotNull private final String text; @NotNull public final String getText() { return this.text; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "data", "", "([B)V", "client-common"})
/*    */   public static final class Binary extends Frame { public Binary(@NotNull byte[] data) {
/* 28 */       super(SuspendableWebSocketClient.Frame.Type.BINARY, data);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$Frame.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */