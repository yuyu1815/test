/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import ai.grazie.model.cloud.ContentType;
/*    */ import ai.grazie.model.llm.annotation.MultiModal;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @MultiModal
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\022\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\f\020\006\032\b\022\004\022\0020\0050\004J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\007J\016\020\r\032\0020\b2\006\020\r\032\0020\016R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$ContentBuilder;", "", "()V", "content", "", "Lai/grazie/model/llm/chat/multimodal/ContentElement;", "build", "media", "", "type", "Lai/grazie/model/cloud/ContentType;", "data", "", "text", "", "model-llm"})
/*    */ public final class ContentBuilder
/*    */ {
/*    */   @NotNull
/* 54 */   private final List<ContentElement> content = new ArrayList<>();
/*    */   public final boolean text(@NotNull String text) {
/* 56 */     Intrinsics.checkNotNullParameter(text, "text"); return this.content.add(new TextElement(text));
/*    */   }
/*    */   public final boolean media(@NotNull ContentType type, @NotNull byte[] data) {
/* 59 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(data, "data"); return this.content.add(InlineMediaElement.Companion.ofBytes(type, data));
/*    */   } @NotNull
/*    */   public final List<ContentElement> build() {
/* 62 */     return this.content;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChat$ContentBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */