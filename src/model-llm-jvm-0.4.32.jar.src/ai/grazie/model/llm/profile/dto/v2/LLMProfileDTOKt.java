/*    */ package ai.grazie.model.llm.profile.dto.v2;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007\032\f\020\000\032\0020\003*\0020\004H\007\032\f\020\000\032\0020\005*\0020\006H\007¨\006\007"}, d2 = {"toDTOv2", "Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;", "Lai/grazie/model/llm/definitions/ChatDefinition;", "Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "Lai/grazie/model/llm/definitions/CompletionDefinition;", "Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "Lai/grazie/model/llm/profile/LLMProfile;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMProfileDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/v2/LLMProfileDTOKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,58:1\n1557#2:59\n1628#2,3:60\n1557#2:67\n1628#2,3:68\n37#3:63\n36#3,3:64\n37#3:71\n36#3,3:72\n37#3:75\n36#3,3:76\n37#3:79\n36#3,3:80\n*S KotlinDebug\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/v2/LLMProfileDTOKt\n*L\n41#1:59\n41#1:60,3\n50#1:67\n50#1:68,3\n41#1:63\n41#1:64,3\n50#1:71\n50#1:72,3\n51#1:75\n51#1:76,3\n56#1:79\n56#1:80,3\n*E\n"})
/*    */ public final class LLMProfileDTOKt
/*    */ {
/*    */   @Deprecated(message = "In favor v3 counterpart")
/*    */   @NotNull
/*    */   public static final LLMProfileDTO toDTOv2(@NotNull LLMProfile $this$toDTOv2) {
/* 39 */     Intrinsics.checkNotNullParameter($this$toDTOv2, "<this>");
/*    */     
/* 41 */     List list1 = $this$toDTOv2.getFeatures(); LLMProfileID lLMProfileID1 = $this$toDTOv2.getId(); int $i$f$map = 0;
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
/* 61 */       LLMFeature lLMFeature = (LLMFeature)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTOv2$1 = 0; collection.add(lLMFeature.name());
/* 62 */     }  Iterable $this$map$iv = destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 64 */     Iterable iterable1 = $this$map$iv; $this$toDTOv2.getMetadata(); Integer integer = ($this$toDTOv2.getMetadata() != null) ? Integer.valueOf($this$toDTOv2.getMetadata().getMaxTokens()) : null; Boolean bool = Boolean.valueOf($this$toDTOv2.getDeprecated()); CompletionDefinitionDTO completionDefinitionDTO = toDTOv2($this$toDTOv2.getFeatureDefinitions().getCompletionDefinition());
/*    */     ChatDefinitionDTO chatDefinitionDTO = toDTOv2($this$toDTOv2.getFeatureDefinitions().getChatDefinition());
/* 66 */     String[] arrayOfString = (String[])iterable1.toArray((Object[])new String[0]); LLMProfileID lLMProfileID2 = lLMProfileID1; return new LLMProfileDTO(lLMProfileID2, arrayOfString, chatDefinitionDTO, completionDefinitionDTO, bool, integer); } @Deprecated(message = "In favor v3 counterpart") @NotNull public static final ChatDefinitionDTO toDTOv2(@NotNull ChatDefinition $this$toDTOv2) { Intrinsics.checkNotNullParameter($this$toDTOv2, "<this>"); Iterable $this$map$iv = $this$toDTOv2.getSupportedRoles(); int $i$f$map = 0;
/* 67 */     Iterable iterable2 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 68 */     for (Object item$iv$iv : iterable2) {
/* 69 */       LLMChatRole lLMChatRole = (LLMChatRole)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTOv2$2 = 0; collection.add(lLMChatRole.getRole());
/* 70 */     }  $this$map$iv = destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 72 */     Iterable iterable1 = $this$map$iv;
/*    */     
/*    */     Collection $this$toTypedArray$iv = $this$toDTOv2.getParameterDefinition().getSupportedParameters();
/*    */     $i$f$toTypedArray = 0;
/* 76 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 78 */     Attributes.Key[] arrayOfKey = (Attributes.Key[])thisCollection$iv.toArray((Object[])new Attributes.Key[0]); String[] arrayOfString = (String[])iterable1.toArray((Object[])new String[0]); return new ChatDefinitionDTO(arrayOfString, arrayOfKey); } @Deprecated(message = "In favor v3 counterpart") @NotNull public static final CompletionDefinitionDTO toDTOv2(@NotNull CompletionDefinition $this$toDTOv2) { Intrinsics.checkNotNullParameter($this$toDTOv2, "<this>"); Collection $this$toTypedArray$iv = $this$toDTOv2.getParameterDefinition().getSupportedParameters();
/*    */     int $i$f$toTypedArray = 0;
/* 80 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 82 */     return new CompletionDefinitionDTO((Attributes.Key[])thisCollection$iv.toArray((Object[])new Attributes.Key[0])); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v2\LLMProfileDTOKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */