/*    */ package ai.grazie.license;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @JsonClassDiscriminator(discriminator = "_type")
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0172\0020\001:\001\017B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\b\032\0020\t2\006\020\n\032\0020\0002\006\020\013\032\0020\f2\006\020\r\032\0020\016HÇ\001\001\006\020\021\022\023\024\025¨\006\026"}, d2 = {"Lai/grazie/license/License;", "Lai/grazie/license/BaseLicense;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lai/grazie/license/CustomAppLicense;", "Lai/grazie/license/DataloreLicense;", "Lai/grazie/license/IDESLicense;", "Lai/grazie/license/JBALicense;", "Lai/grazie/license/LicenseServerLicense;", "Lai/grazie/license/YTLicense;", "model-license"})
/*    */ public abstract class License implements BaseLicense {
/*    */   @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); private License() {} @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(CustomAppLicense.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(DataloreLicense.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(IDESLicense.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(JBALicense.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(LicenseServerLicense.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(YTLicense.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)CustomAppLicense.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)DataloreLicense.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IDESLicense.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)JBALicense.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)LicenseServerLicense.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)YTLicense.$serializer.INSTANCE; Annotation[] arrayOfAnnotation = new Annotation[1]; arrayOfAnnotation[0] = 
/* 11 */         (Annotation)new License$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type");
/*    */       return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.license.License", Reflection.getOrCreateKotlinClass(License.class), arrayOfKClass, arrayOfKSerializer, arrayOfAnnotation); }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/License$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/License;", "model-license"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<License> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\License.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */