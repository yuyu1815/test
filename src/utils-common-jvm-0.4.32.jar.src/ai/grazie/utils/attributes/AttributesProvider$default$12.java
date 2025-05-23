/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\002H\0022\006\020\006\032\0020\001H\n¢\006\004\b\007\020\b"}, d2 = {"<anonymous>", "Lai/grazie/utils/attributes/Attributes$Value;", "Entity", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "id", "value", "invoke", "(Lai/grazie/utils/attributes/Attributes$Key;Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes$Value;)Lai/grazie/utils/attributes/Attributes$Value;"})
/*    */ final class AttributesProvider$default$12
/*    */   extends Lambda
/*    */   implements Function3<Attributes.Key, Entity, Attributes.Value, Attributes.Value>
/*    */ {
/*    */   public final Attributes.Value invoke(Attributes.Key key, Object id, Attributes.Value value) {
/* 91 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return (Attributes.Value)this.$set.invoke(key, id, ((Attributes.Value.Double)value).getValue());
/*    */   }
/*    */   
/*    */   AttributesProvider$default$12(Function3<Attributes.Key.Double, Entity, Double, Attributes.Value.Double> $set) {
/*    */     super(3);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributesProvider$default$12.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */