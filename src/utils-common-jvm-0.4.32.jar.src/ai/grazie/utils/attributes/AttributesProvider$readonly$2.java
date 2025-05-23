/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\005\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "Lai/grazie/utils/attributes/Attributes$Value;", "Entity", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes$Value;)Lai/grazie/utils/attributes/Attributes$Value;"})
/*    */ final class AttributesProvider$readonly$2
/*    */   extends Lambda
/*    */   implements Function2<Entity, Attributes.Value, Attributes.Value>
/*    */ {
/*    */   public final Attributes.Value invoke(Entity paramEntity, Attributes.Value paramValue) {
/* 58 */     Intrinsics.checkNotNullParameter(paramValue, "<anonymous parameter 1>"); this.$nothing.invoke("Attribute " + this.$key.getFqdn() + " cannot be set via attribute API"); throw new KotlinNothingValueException();
/*    */   }
/*    */   
/*    */   AttributesProvider$readonly$2(Function1 $nothing, Attributes.Key $key) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributesProvider$readonly$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */