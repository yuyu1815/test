/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatRole;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nRoleDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n*S KotlinDebug\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$2\n*L\n24#1:28\n24#1:29,3\n*E\n"})
/*    */ final class RoleDefinition$validateMessages$2
/*    */   extends Lambda
/*    */   implements Function0<String> {
/*    */   RoleDefinition$validateMessages$2(Set<LLMMultiModalChatRole> $unsupportedRoles, String $name) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final String invoke() {
/* 24 */     Iterable<LLMMultiModalChatRole> $this$map$iv = this.$unsupportedRoles; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */     
/* 28 */     Iterable<LLMMultiModalChatRole> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 29 */     for (LLMMultiModalChatRole item$iv$iv : iterable1) {
/* 30 */       LLMMultiModalChatRole lLMMultiModalChatRole1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-RoleDefinition$validateMessages$2$1 = 0; collection.add(lLMMultiModalChatRole1.name());
/* 31 */     }  return "Roles " + (List)destination$iv$iv + " are not supported for multimodal chat " + this.$name + " provider";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\RoleDefinition$validateMessages$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */