/*    */ package ai.grazie.license;
/*    */ 
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J#\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\bH\002J\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/license/CustomAppLicense$Companion;", "", "()V", "invoke", "Lai/grazie/license/CustomAppLicense;", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "serializer", "Lkotlinx/serialization/KSerializer;", "model-license"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<CustomAppLicense> serializer() {
/* 20 */     return (KSerializer<CustomAppLicense>)CustomAppLicense.$serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CustomAppLicense invoke(@NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till) {
/* 25 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(since, "since"); Intrinsics.checkNotNullParameter(till, "till"); return new CustomAppLicense(new LicenseID("custom_app:" + UUID.Companion.random().getText()), type, since, till);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\CustomAppLicense$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */