/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "client-common"})
/*    */ public final class Text
/*    */   extends SuspendableWebSocketClient.Frame
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   public Text(@NotNull String text) {
/* 26 */     super(SuspendableWebSocketClient.Frame.Type.TEXT, StringsKt.encodeToByteArray(text)); this.text = text; } @NotNull public final String getText() { return this.text; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$Frame$Text.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */