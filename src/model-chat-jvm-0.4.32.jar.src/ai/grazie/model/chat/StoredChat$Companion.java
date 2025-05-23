/*    */ package ai.grazie.model.chat;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/chat/StoredChat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/chat/StoredChat;", "model-chat"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<StoredChat> serializer() {
/* 10 */     return (KSerializer<StoredChat>)StoredChat.$serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-chat-jvm-0.4.32.jar!\ai\grazie\model\chat\StoredChat$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */