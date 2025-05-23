/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<KSerializer<Object>>
/*     */ {
/*     */   public static final null INSTANCE = (null)new Object();
/*     */   
/*     */   null() {
/*     */     super(0);
/*     */   }
/*     */   
/*     */   public final KSerializer<Object> invoke() {
/* 144 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(Attributes.Key.Bool.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(Attributes.Key.Bytes.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(Attributes.Key.Double.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(Attributes.Key.Json.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(Attributes.Key.Long.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(Attributes.Key.Text.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)Attributes.Key.Bool.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Attributes.Key.Bytes.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Attributes.Key.Double.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)Attributes.Key.Json.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)Attributes.Key.Long.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)Attributes.Key.Text.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.utils.attributes.Attributes.Key", Reflection.getOrCreateKotlinClass(Attributes.Key.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\Attributes$Key$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */