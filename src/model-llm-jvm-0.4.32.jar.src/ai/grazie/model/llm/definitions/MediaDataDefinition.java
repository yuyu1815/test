/*    */ package ai.grazie.model.llm.definitions;
/*    */ import ai.grazie.model.llm.chat.multimodal.InlineMediaElement;
/*    */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat;
/*    */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatMessage;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\t\n\002\b\003\n\002\020\"\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\030\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\024\020\002\032\004\030\0010\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\030\020\n\032\b\022\004\022\0020\f0\013X¦\004¢\006\006\032\004\b\r\020\016ø\001\000\002\006\n\004\b!0\001¨\006\025À\006\001"}, d2 = {"Lai/grazie/model/llm/definitions/MediaDataDefinition;", "", "maxNumber", "", "getMaxNumber", "()Ljava/lang/Integer;", "maxSize", "", "getMaxSize", "()J", "supportedTypes", "", "Lai/grazie/model/cloud/ContentType;", "getSupportedTypes", "()Ljava/util/Set;", "validateMediaData", "", "name", "", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nMediaDataDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaDataDefinition.kt\nai/grazie/model/llm/definitions/MediaDataDefinition\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1368#2:48\n1454#2,5:49\n808#2,11:54\n1863#2,2:65\n*S KotlinDebug\n*F\n+ 1 MediaDataDefinition.kt\nai/grazie/model/llm/definitions/MediaDataDefinition\n*L\n28#1:48\n28#1:49,5\n29#1:54,11\n37#1:65,2\n*E\n"})
/*    */ public interface MediaDataDefinition {
/*    */   long getMaxSize();
/*    */   
/*    */   @Nullable
/*    */   Integer getMaxNumber();
/*    */   
/*    */   @NotNull
/*    */   Set<ContentType> getSupportedTypes();
/*    */   
/*    */   default void validateMediaData(@NotNull String name, @NotNull LLMMultiModalChat chat) {
/* 27 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(chat, "chat"); List list1 = chat.getMessages();
/* 28 */     int $i$f$flatMap = 0;
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
/* 48 */     List list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 49 */     for (Object element$iv$iv : list2) {
/* 50 */       LLMMultiModalChatMessage it = (LLMMultiModalChatMessage)element$iv$iv; int $i$a$-flatMap-MediaDataDefinition$validateMediaData$mediaElements$1 = 0; Iterable list$iv$iv = it.getContent();
/* 51 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 53 */     Iterable $this$flatMap$iv = destination$iv$iv; int $i$f$filterIsInstance = 0;
/* 54 */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv; destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     for (Object element$iv$iv : $this$flatMapTo$iv$iv) { if (element$iv$iv instanceof InlineMediaElement) destination$iv$iv.add(element$iv$iv);  }
/* 64 */      List<InlineMediaElement> mediaElements = (List)destination$iv$iv; if (getMaxNumber() != null) { int it = getMaxNumber().intValue(), $i$a$-let-MediaDataDefinition$validateMediaData$1 = 0; ExtensionsKt.requireOrBadRequest((mediaElements.size() <= it), new MediaDataDefinition$validateMediaData$1$1(it, mediaElements)); } else { getMaxNumber(); }
/* 65 */      Iterable<InlineMediaElement> $this$forEach$iv = mediaElements; int $i$f$forEach = 0; Iterator<InlineMediaElement> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); InlineMediaElement it = (InlineMediaElement)element$iv; int $i$a$-forEach-MediaDataDefinition$validateMediaData$2 = 0; }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class MediaDataDefinition$validateMediaData$1$1 extends Lambda implements Function0<String> {
/*    */     public final String invoke() {
/*    */       return "Too many media elements. Maximum allowed is " + this.$it + ", but found " + this.$mediaElements.size();
/*    */     }
/*    */     
/*    */     MediaDataDefinition$validateMediaData$1$1(int $it, List<InlineMediaElement> $mediaElements) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class MediaDataDefinition$validateMediaData$2$1 extends Lambda implements Function0<String> {
/*    */     public final String invoke() {
/*    */       return "Media data size is bigger than " + MediaDataDefinition.this.getMaxSize();
/*    */     }
/*    */     
/*    */     MediaDataDefinition$validateMediaData$2$1() {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class MediaDataDefinition$validateMediaData$2$2 extends Lambda implements Function0<String> {
/*    */     public final String invoke() {
/*    */       return "Media data type " + this.$it.getMimeType() + " is not supported. Supported types: " + CollectionsKt.joinToString$default(MediaDataDefinition.this.getSupportedTypes(), null, null, null, 0, null, null, 63, null);
/*    */     }
/*    */     
/*    */     MediaDataDefinition$validateMediaData$2$2(MediaDataDefinition $receiver) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\MediaDataDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */