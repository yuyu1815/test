/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\007\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rJ\036\020\016\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rJ\017\020\017\032\b\022\004\022\0020\0040\020HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/gec/model/problem/ProblemKindID$Companion;", "", "()V", "legacy", "Lai/grazie/gec/model/problem/ProblemKindID;", "getLegacy", "()Lai/grazie/gec/model/problem/ProblemKindID;", "local", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "language", "Lai/grazie/nlp/langs/Language;", "id", "", "of", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<ProblemKindID> serializer() {
/* 22 */     return (KSerializer<ProblemKindID>)ProblemKindID.Serializer.INSTANCE; } @NotNull
/* 23 */   public final ProblemKindID getLegacy() { return ProblemKindID.access$getLegacy$cp(); }
/*    */    @NotNull
/*    */   public final ProblemKindID local(@NotNull CorrectionServiceType service, @NotNull Language language, @NotNull String id) {
/* 26 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullExpressionValue((service.name() + ".local." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT), "toLowerCase(...)"); return new ProblemKindID((service.name() + ".local." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT));
/*    */   }
/*    */   @NotNull
/*    */   public final ProblemKindID of(@NotNull CorrectionServiceType service, @NotNull Language language, @NotNull String id) {
/* 30 */     Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullExpressionValue((service.name() + "." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT), "toLowerCase(...)"); return new ProblemKindID((service.name() + "." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemKindID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */