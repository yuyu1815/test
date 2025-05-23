/*    */ package ai.grazie.model.llm.definitions;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatRole;
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\bf\030\0002\0020\001J#\020\n\032\0020\0132\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0200\017H\026¢\006\002\020\021J\036\020\n\032\0020\0132\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0230\022H\026R\032\020\002\032\b\022\004\022\0020\0040\0038VX\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\b\022\004\022\0020\b0\003X¦\004¢\006\006\032\004\b\t\020\006ø\001\000\002\006\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Lai/grazie/model/llm/definitions/RoleDefinition;", "", "supportedMultiModalRoles", "", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "getSupportedMultiModalRoles", "()Ljava/util/Set;", "supportedRoles", "Lai/grazie/model/llm/chat/LLMChatRole;", "getSupportedRoles", "validateMessages", "", "name", "", "messages", "", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "(Ljava/lang/String;[Lai/grazie/model/llm/chat/v5/LLMChatMessage;)V", "", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nRoleDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n11158#2:28\n11493#2,3:29\n1557#3:32\n1628#3,3:33\n*S KotlinDebug\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition\n*L\n18#1:28\n18#1:29,3\n23#1:32\n23#1:33,3\n*E\n"})
/*    */ public interface RoleDefinition {
/*    */   @NotNull
/*    */   Set<LLMChatRole> getSupportedRoles();
/*    */   
/*    */   @NotNull
/*    */   default Set<LLMMultiModalChatRole> getSupportedMultiModalRoles() {
/* 15 */     return SetsKt.emptySet();
/*    */   }
/*    */   
/* 18 */   default void validateMessages(@NotNull String name, @NotNull LLMChatMessage[] messages) { Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(messages, "messages"); LLMChatMessage[] arrayOfLLMChatMessage1 = messages; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     LLMChatMessage[] arrayOfLLMChatMessage2 = arrayOfLLMChatMessage1; Collection<LLMChatRole> destination$iv$iv = new ArrayList(arrayOfLLMChatMessage1.length); int $i$f$mapTo = 0; byte b; int i;
/* 29 */     for (b = 0, i = arrayOfLLMChatMessage2.length; b < i; ) { Object item$iv$iv = arrayOfLLMChatMessage2[b];
/* 30 */       Object object1 = item$iv$iv; Collection<LLMChatRole> collection = destination$iv$iv; int $i$a$-map-RoleDefinition$validateMessages$unsupportedRoles$1 = 0; collection.add(object1.getRole()); }
/* 31 */      Set<? extends LLMChatRole> unsupportedRoles = CollectionsKt.subtract(CollectionsKt.toSet(destination$iv$iv), getSupportedRoles()); ExtensionsKt.requireOrBadRequest(unsupportedRoles.isEmpty(), new RoleDefinition$validateMessages$1(unsupportedRoles, name)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nRoleDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n*S KotlinDebug\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$1\n*L\n19#1:28\n19#1:29,3\n*E\n"}) static final class RoleDefinition$validateMessages$1 extends Lambda implements Function0<String> { public final String invoke() { Iterable<LLMChatRole> $this$map$iv = this.$unsupportedRoles; int $i$f$map = 0; Iterable<LLMChatRole> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0; for (LLMChatRole item$iv$iv : iterable1) { LLMChatRole lLMChatRole1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-RoleDefinition$validateMessages$1$1 = 0; collection.add(lLMChatRole1.getRole()); }  return "Roles " + (List)destination$iv$iv + " are not supported for chat " + this.$name + " provider"; } RoleDefinition$validateMessages$1(Set<LLMChatRole> $unsupportedRoles, String $name) { super(0); } }
/* 32 */    default void validateMessages(@NotNull String name, @NotNull List messages) { Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(messages, "messages"); Iterable $this$map$iv = messages; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<LLMMultiModalChatRole> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 33 */     for (Object item$iv$iv : iterable1) {
/* 34 */       LLMMultiModalChatMessage lLMMultiModalChatMessage = (LLMMultiModalChatMessage)item$iv$iv; Collection<LLMMultiModalChatRole> collection = destination$iv$iv; int $i$a$-map-RoleDefinition$validateMessages$unsupportedRoles$2 = 0; collection.add(lLMMultiModalChatMessage.getRole());
/* 35 */     }  Set<? extends LLMMultiModalChatRole> unsupportedRoles = CollectionsKt.subtract(CollectionsKt.toSet(destination$iv$iv), getSupportedMultiModalRoles());
/*    */     ExtensionsKt.requireOrBadRequest(unsupportedRoles.isEmpty(), new RoleDefinition$validateMessages$2(unsupportedRoles, name)); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nRoleDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n*S KotlinDebug\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$2\n*L\n24#1:28\n24#1:29,3\n*E\n"})
/*    */   static final class RoleDefinition$validateMessages$2 extends Lambda implements Function0<String> {
/*    */     RoleDefinition$validateMessages$2(Set<LLMMultiModalChatRole> $unsupportedRoles, String $name) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       Iterable<LLMMultiModalChatRole> $this$map$iv = this.$unsupportedRoles;
/*    */       int $i$f$map = 0;
/*    */       Iterable<LLMMultiModalChatRole> iterable1 = $this$map$iv;
/*    */       Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*    */       int $i$f$mapTo = 0;
/*    */       for (LLMMultiModalChatRole item$iv$iv : iterable1) {
/*    */         LLMMultiModalChatRole lLMMultiModalChatRole1 = item$iv$iv;
/*    */         Collection<String> collection = destination$iv$iv;
/*    */         int $i$a$-map-RoleDefinition$validateMessages$2$1 = 0;
/*    */         collection.add(lLMMultiModalChatRole1.name());
/*    */       } 
/*    */       return "Roles " + (List)destination$iv$iv + " are not supported for multimodal chat " + this.$name + " provider";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\RoleDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */