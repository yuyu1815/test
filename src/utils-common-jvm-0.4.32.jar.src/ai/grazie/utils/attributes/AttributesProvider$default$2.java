/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020$\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\000\020\000\032\020\022\004\022\002H\002\022\006\022\004\030\0010\0030\001\"\004\b\000\020\0022\006\020\004\032\0020\0052\f\020\006\032\b\022\004\022\002H\0020\007H\n¢\006\002\b\b"}, d2 = {"<anonymous>", "", "Entity", "Lai/grazie/utils/attributes/Attributes$Value;", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "value", "", "invoke"})
/*    */ final class AttributesProvider$default$2
/*    */   extends Lambda
/*    */   implements Function2<Attributes.Key, List<? extends Entity>, Map<Entity, ? extends Attributes.Value>>
/*    */ {
/*    */   AttributesProvider$default$2(Function2<Attributes.Key, List<? extends Entity>, Map<Entity, Attributes.Value>> $getBulk) {
/*    */     super(2);
/*    */   }
/*    */   
/*    */   public final Map<Entity, Attributes.Value> invoke(Attributes.Key key, List value) {
/* 44 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return (Map<Entity, Attributes.Value>)this.$getBulk.invoke(key, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributesProvider$default$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */