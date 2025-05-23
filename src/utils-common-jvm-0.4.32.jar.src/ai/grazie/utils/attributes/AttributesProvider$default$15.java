/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\004\030\0010\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\002H\002H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Lai/grazie/utils/attributes/Attributes$Value;", "Entity", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "id", "invoke", "(Lai/grazie/utils/attributes/Attributes$Key;Ljava/lang/Object;)Lai/grazie/utils/attributes/Attributes$Value;"})
/*     */ final class AttributesProvider$default$15
/*     */   extends Lambda
/*     */   implements Function2<Attributes.Key, Entity, Attributes.Value>
/*     */ {
/*     */   public final Attributes.Value invoke(Attributes.Key key, Object id) {
/* 106 */     Intrinsics.checkNotNullParameter(key, "key"); return (Attributes.Value)this.$delete.invoke(key, id);
/*     */   }
/*     */   
/*     */   AttributesProvider$default$15(Function2<Attributes.Key.Text, Entity, Attributes.Value.Text> $delete) {
/*     */     super(2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributesProvider$default$15.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */