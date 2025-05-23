/*     */ package ai.grazie.model.llm.profile.dto.v3;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.LLMChatRole;
/*     */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatRole;
/*     */ import ai.grazie.model.llm.definitions.ChatDefinition;
/*     */ import ai.grazie.model.llm.definitions.CompletionDefinition;
/*     */ import ai.grazie.model.llm.definitions.MultimodalChatDefinition;
/*     */ import ai.grazie.model.llm.profile.LLMFeature;
/*     */ import ai.grazie.model.llm.profile.LLMProfile;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.utils.ProfilesKt;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\032\n\020\000\032\0020\001*\0020\002\032\n\020\000\032\0020\003*\0020\004\032\n\020\000\032\0020\005*\0020\006\032\024\020\000\032\0020\007*\0020\b2\b\b\002\020\t\032\0020\n¨\006\013"}, d2 = {"toDTOv3", "Lai/grazie/model/llm/profile/dto/v3/ChatDefinitionDTO;", "Lai/grazie/model/llm/definitions/ChatDefinition;", "Lai/grazie/model/llm/profile/dto/v3/CompletionDefinitionDTO;", "Lai/grazie/model/llm/definitions/CompletionDefinition;", "Lai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO;", "Lai/grazie/model/llm/definitions/MultimodalChatDefinition;", "Lai/grazie/model/llm/profile/dto/v3/LLMProfileDTO;", "Lai/grazie/model/llm/profile/LLMProfile;", "internal", "", "model-llm"})
/*     */ @SourceDebugExtension({"SMAP\nLLMProfileDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/v3/LLMProfileDTOKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n1#2:92\n1557#3:93\n1628#3,3:94\n1557#3:101\n1628#3,3:102\n1557#3:117\n1628#3,3:118\n37#4:97\n36#4,3:98\n37#4:105\n36#4,3:106\n37#4:109\n36#4,3:110\n37#4:113\n36#4,3:114\n*S KotlinDebug\n*F\n+ 1 LLMProfileDTO.kt\nai/grazie/model/llm/profile/dto/v3/LLMProfileDTOKt\n*L\n65#1:93\n65#1:94,3\n78#1:101\n78#1:102,3\n87#1:117\n87#1:118,3\n65#1:97\n65#1:98,3\n78#1:105\n78#1:106,3\n79#1:109\n79#1:110,3\n83#1:113\n83#1:114,3\n*E\n"})
/*     */ public final class LLMProfileDTOKt
/*     */ {
/*     */   @NotNull
/*     */   public static final LLMProfileDTO toDTOv3(@NotNull LLMProfile $this$toDTOv3, boolean internal) {
/*  63 */     Intrinsics.checkNotNullParameter($this$toDTOv3, "<this>"); LLMProfileID lLMProfileID = $this$toDTOv3.getId();
/*  64 */     String str2 = $this$toDTOv3.getProviderModelID(), it = str2;
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
/*  92 */     int $i$a$-takeIf-LLMProfileDTOKt$toDTOv3$1 = 0; String str1 = internal ? str2 : null; Iterable $this$map$iv = $this$toDTOv3.getFeatures(); int $i$f$map = 0;
/*  93 */     Iterable iterable2 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/*  94 */     for (Object item$iv$iv : iterable2) {
/*  95 */       LLMFeature lLMFeature = (LLMFeature)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTOv3$2 = 0; collection.add(lLMFeature.name());
/*  96 */     }  $this$map$iv = destination$iv$iv;
/*     */     int $i$f$toTypedArray = 0;
/*  98 */     Iterable iterable1 = $this$map$iv;
/*     */     
/* 100 */     String[] arrayOfString = (String[])iterable1.toArray((Object[])new String[0]); ChatDefinitionDTO chatDefinitionDTO = toDTOv3($this$toDTOv3.getFeatureDefinitions().getChatDefinition()); CompletionDefinitionDTO completionDefinitionDTO = toDTOv3($this$toDTOv3.getFeatureDefinitions().getCompletionDefinition()); $this$toDTOv3.getFeatureDefinitions().getMultimodalChatDefinition(); MultimodalChatDefinitionDTO multimodalChatDefinitionDTO = ($this$toDTOv3.getFeatureDefinitions().getMultimodalChatDefinition() != null) ? toDTOv3($this$toDTOv3.getFeatureDefinitions().getMultimodalChatDefinition()) : null; boolean bool1 = $this$toDTOv3.getDeprecated(); $this$toDTOv3.getMetadata(); Integer integer1 = ($this$toDTOv3.getMetadata() != null) ? Integer.valueOf($this$toDTOv3.getMetadata().getMaxTokens()) : null; boolean bool2 = ProfilesKt.checkIfExperimental($this$toDTOv3); String str3 = $this$toDTOv3.getType().name(); String str4 = ProfilesKt.toName($this$toDTOv3.getId()); $this$toDTOv3.getMetadata(); Integer integer2 = ($this$toDTOv3.getMetadata() != null) ? $this$toDTOv3.getMetadata().getMaxOutputTokens() : null; return new LLMProfileDTO(lLMProfileID, arrayOfString, chatDefinitionDTO, completionDefinitionDTO, bool1, integer1, integer2, bool2, str3, str4, str1, multimodalChatDefinitionDTO); } @NotNull public static final ChatDefinitionDTO toDTOv3(@NotNull ChatDefinition $this$toDTOv3) { Intrinsics.checkNotNullParameter($this$toDTOv3, "<this>"); Iterable $this$map$iv = $this$toDTOv3.getSupportedRoles(); int $i$f$map = 0;
/* 101 */     Iterable iterable2 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 102 */     for (Object item$iv$iv : iterable2) {
/* 103 */       LLMChatRole lLMChatRole = (LLMChatRole)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTOv3$3 = 0; collection.add(lLMChatRole.getRole());
/* 104 */     }  $this$map$iv = destination$iv$iv;
/*     */     int $i$f$toTypedArray = 0;
/* 106 */     Iterable iterable1 = $this$map$iv;
/*     */     
/*     */     Collection $this$toTypedArray$iv = $this$toDTOv3.getParameterDefinition().getSupportedParameters();
/*     */     $i$f$toTypedArray = 0;
/* 110 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*     */     
/* 112 */     Attributes.Key[] arrayOfKey = (Attributes.Key[])thisCollection$iv.toArray((Object[])new Attributes.Key[0]); String[] arrayOfString = (String[])iterable1.toArray((Object[])new String[0]); return new ChatDefinitionDTO(arrayOfString, arrayOfKey); } @NotNull public static final CompletionDefinitionDTO toDTOv3(@NotNull CompletionDefinition $this$toDTOv3) { Intrinsics.checkNotNullParameter($this$toDTOv3, "<this>"); Collection $this$toTypedArray$iv = $this$toDTOv3.getParameterDefinition().getSupportedParameters();
/*     */     int $i$f$toTypedArray = 0;
/* 114 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*     */     
/* 116 */     return new CompletionDefinitionDTO((Attributes.Key[])thisCollection$iv.toArray((Object[])new Attributes.Key[0])); } @NotNull public static final MultimodalChatDefinitionDTO toDTOv3(@NotNull MultimodalChatDefinition $this$toDTOv3) { Intrinsics.checkNotNullParameter($this$toDTOv3, "<this>"); Iterable $this$map$iv = $this$toDTOv3.getSupportedRoles(); int $i$f$map = 0;
/* 117 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 118 */     for (Object item$iv$iv : iterable1) {
/* 119 */       LLMMultiModalChatRole lLMMultiModalChatRole = (LLMMultiModalChatRole)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-LLMProfileDTOKt$toDTOv3$4 = 0; collection.add(lLMMultiModalChatRole.name());
/* 120 */     }  MediaDataDefinitionDTO mediaDataDefinitionDTO = new MediaDataDefinitionDTO($this$toDTOv3.getMediaDataDefinition().getSupportedTypes(), (int)$this$toDTOv3.getMediaDataDefinition().getMaxSize(), $this$toDTOv3.getMediaDataDefinition().getMaxNumber()); Set<? extends Attributes.Key> set = $this$toDTOv3.getParameterDefinition().getSupportedParameters(); List<String> list = (List)destination$iv$iv;
/*     */     return new MultimodalChatDefinitionDTO(list, set, mediaDataDefinitionDTO); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v3\LLMProfileDTOKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */