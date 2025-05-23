/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
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
/*    */ @SourceDebugExtension({"SMAP\nParameterDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParameterDefinition.kt\nai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1557#2:37\n1628#2,3:38\n*S KotlinDebug\n*F\n+ 1 ParameterDefinition.kt\nai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$1\n*L\n18#1:37\n18#1:38,3\n*E\n"})
/*    */ final class ParameterDefinition$validateParameters$1 extends Lambda implements Function0<String> {
/*    */   public final String invoke() {
/* 18 */     Iterable<Attributes.Key> $this$map$iv = this.$unsupportedParameters; int $i$f$map = 0;
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
/* 37 */     Iterable<Attributes.Key> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 38 */     for (Attributes.Key item$iv$iv : iterable1) {
/* 39 */       Attributes.Key key1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-ParameterDefinition$validateParameters$1$1 = 0; collection.add(key1.getFqdn());
/* 40 */     }  return "Parameters " + (List)destination$iv$iv + " are not supported for chat " + this.$name + " provider";
/*    */   }
/*    */   
/*    */   ParameterDefinition$validateParameters$1(Set<Attributes.Key> $unsupportedParameters, String $name) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\ParameterDefinition$validateParameters$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */