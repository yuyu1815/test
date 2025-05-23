/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
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
/*    */ @SourceDebugExtension({"SMAP\nRoleDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n*S KotlinDebug\n*F\n+ 1 RoleDefinition.kt\nai/grazie/model/llm/definitions/RoleDefinition$validateMessages$1\n*L\n19#1:28\n19#1:29,3\n*E\n"})
/*    */ final class RoleDefinition$validateMessages$1
/*    */   extends Lambda implements Function0<String> {
/*    */   public final String invoke() {
/* 19 */     Iterable<LLMChatRole> $this$map$iv = this.$unsupportedRoles; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     Iterable<LLMChatRole> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 29 */     for (LLMChatRole item$iv$iv : iterable1) {
/* 30 */       LLMChatRole lLMChatRole1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-RoleDefinition$validateMessages$1$1 = 0; collection.add(lLMChatRole1.getRole());
/* 31 */     }  return "Roles " + (List)destination$iv$iv + " are not supported for chat " + this.$name + " provider";
/*    */   }
/*    */   
/*    */   RoleDefinition$validateMessages$1(Set<LLMChatRole> $unsupportedRoles, String $name) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\RoleDefinition$validateMessages$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */