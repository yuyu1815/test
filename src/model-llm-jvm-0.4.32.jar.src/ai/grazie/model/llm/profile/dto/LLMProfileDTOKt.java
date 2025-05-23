/*    */ package ai.grazie.model.llm.profile.dto;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import ai.grazie.model.llm.definitions.ChatDefinition;
/*    */ import ai.grazie.model.llm.definitions.CompletionDefinition;
/*    */ import ai.grazie.model.llm.profile.LLMFeature;
/*    */ import ai.grazie.model.llm.profile.LLMProfile;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007\032\f\020\000\032\0020\003*\0020\004H\007\032\f\020\000\032\0020\005*\0020\006H\007¨\006\007"}, d2 = {"toDTO", "Lai/grazie/model/llm/profile/dto/ChatDefinitionDTO;", "Lai/grazie/model/llm/definitions/ChatDefinition;", "Lai/grazie/model/llm/profile/dto/CompletionDefinitionDTO;", "Lai/grazie/model/llm/definitions/CompletionDefinition;", "Lai/grazie/model/llm/profile/dto/LLMProfileDTO;", "Lai/grazie/model/llm/profile/LLMProfile;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMProfileDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/LLMProfileDTOKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1557#2:59\n1628#2,3:60\n1557#2:63\n1628#2,3:64\n*S KotlinDebug\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/LLMProfileDTOKt\n*L\n41#1:59\n41#1:60,3\n50#1:63\n50#1:64,3\n*E\n"})
/*    */ public final class LLMProfileDTOKt
/*    */ {
/*    */   @Deprecated(message = "In favor v2 counterpart")
/*    */   @NotNull
/*    */   public static final LLMProfileDTO toDTO(@NotNull LLMProfile $this$toDTO) {
/* 39 */     Intrinsics.checkNotNullParameter($this$toDTO, "<this>");
/*    */     
/* 41 */     List list1 = $this$toDTO.getFeatures(); LLMProfileID lLMProfileID1 = $this$toDTO.getId(); int $i$f$map = 0;
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
/* 59 */     List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 60 */     for (Object item$iv$iv : list2) {
/* 61 */       LLMFeature lLMFeature = (LLMFeature)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTO$1 = 0; collection.add(lLMFeature.name());
/* 62 */     }  $this$toDTO.getMetadata(); Integer integer = ($this$toDTO.getMetadata() != null) ? Integer.valueOf($this$toDTO.getMetadata().getMaxTokens()) : null; Boolean bool = Boolean.valueOf($this$toDTO.getDeprecated()); CompletionDefinitionDTO completionDefinitionDTO = toDTO($this$toDTO.getFeatureDefinitions().getCompletionDefinition()); ChatDefinitionDTO chatDefinitionDTO = toDTO($this$toDTO.getFeatureDefinitions().getChatDefinition()); List<String> list = (List)destination$iv$iv; LLMProfileID lLMProfileID2 = lLMProfileID1; return new LLMProfileDTO(lLMProfileID2, list, chatDefinitionDTO, completionDefinitionDTO, bool, integer); } @Deprecated(message = "In favor v2 counterpart") @NotNull public static final ChatDefinitionDTO toDTO(@NotNull ChatDefinition $this$toDTO) { Intrinsics.checkNotNullParameter($this$toDTO, "<this>"); Iterable $this$map$iv = $this$toDTO.getSupportedRoles(); int $i$f$map = 0;
/* 63 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 64 */     for (Object item$iv$iv : iterable1) {
/* 65 */       LLMChatRole lLMChatRole = (LLMChatRole)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTO$2 = 0; collection.add(lLMChatRole.getRole());
/* 66 */     }  Set<? extends Attributes.Key> set = $this$toDTO.getParameterDefinition().getSupportedParameters(); List<String> list = (List)destination$iv$iv;
/*    */     return new ChatDefinitionDTO(list, set); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "In favor v2 counterpart")
/*    */   @NotNull
/*    */   public static final CompletionDefinitionDTO toDTO(@NotNull CompletionDefinition $this$toDTO) {
/*    */     Intrinsics.checkNotNullParameter($this$toDTO, "<this>");
/*    */     return new CompletionDefinitionDTO($this$toDTO.getParameterDefinition().getSupportedParameters());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\LLMProfileDTOKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */