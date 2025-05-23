/*     */ package ai.grazie.user.storage.model;
/*     */ 
/*     */ import ai.grazie.model.chat.StoredChat;
/*     */ import ai.grazie.model.chat.StoredChatMetadata;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002\032\n\020\000\032\0020\003*\0020\004¨\006\005"}, d2 = {"toOldDTO", "Lai/grazie/user/storage/model/StoredChat;", "Lai/grazie/model/chat/StoredChat;", "Lai/grazie/user/storage/model/StoredChatMetadata;", "Lai/grazie/model/chat/StoredChatMetadata;", "user-strg-model"})
/*     */ public final class ChatApiKt
/*     */ {
/*     */   @NotNull
/*     */   public static final StoredChat toOldDTO(@NotNull StoredChat $this$toOldDTO) {
/* 149 */     Intrinsics.checkNotNullParameter($this$toOldDTO, "<this>"); return new StoredChat(toOldDTO($this$toOldDTO.getMetadata()), $this$toOldDTO.getContent()); } @NotNull
/*     */   public static final StoredChatMetadata toOldDTO(@NotNull StoredChatMetadata $this$toOldDTO) {
/* 151 */     Intrinsics.checkNotNullParameter($this$toOldDTO, "<this>"); return new StoredChatMetadata($this$toOldDTO.getChatId(), $this$toOldDTO.getName(), $this$toOldDTO.getProfile(), $this$toOldDTO.getPinned(), $this$toOldDTO.getCreated(), $this$toOldDTO.getUpdated());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\ChatApiKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */