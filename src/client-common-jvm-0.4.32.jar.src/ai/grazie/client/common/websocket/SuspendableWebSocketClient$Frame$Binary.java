/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "data", "", "([B)V", "client-common"})
/*    */ public final class Binary
/*    */   extends SuspendableWebSocketClient.Frame
/*    */ {
/*    */   public Binary(@NotNull byte[] data) {
/* 28 */     super(SuspendableWebSocketClient.Frame.Type.BINARY, data);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$Frame$Binary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */