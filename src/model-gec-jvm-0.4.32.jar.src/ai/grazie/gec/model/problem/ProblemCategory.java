/*    */ package ai.grazie.gec.model.problem;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Deprecated(message = "JBAI-3629 in favour of Category, will be removed after client update")
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\013\n\002\b\f\b\001\030\000 \0172\b\022\004\022\0020\0000\001:\001\017B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\0048F¢\006\006\032\004\b\003\020\005R\021\020\006\032\0020\0048F¢\006\006\032\004\b\006\020\005R\021\020\007\032\0020\0048F¢\006\006\032\004\b\007\020\005j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016¨\006\020"}, d2 = {"Lai/grazie/gec/model/problem/ProblemCategory;", "", "(Ljava/lang/String;I)V", "isSpelling", "", "()Z", "isStyle", "isTypography", "SPELLING", "PUNCTUATION", "TYPOGRAPHY", "GRAMMAR", "SEMANTICS", "STYLE", "OTHER", "Companion", "model-gec"})
/*    */ public enum ProblemCategory {
/* 14 */   SPELLING,
/* 15 */   PUNCTUATION,
/* 16 */   TYPOGRAPHY,
/* 17 */   GRAMMAR,
/* 18 */   SEMANTICS,
/* 19 */   STYLE,
/* 20 */   OTHER; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/* 23 */     null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.gec.model.problem.ProblemCategory", (Enum[])ProblemCategory.values()); } } public final boolean isSpelling() { return (this == SPELLING); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemCategory$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemCategory;", "model-gec"}) public static final class Companion {
/*    */     private Companion() {} @NotNull
/* 26 */     public final KSerializer<ProblemCategory> serializer() { return get$cachedSerializer(); } } public final boolean isStyle() { return (this == STYLE); }
/*    */   
/*    */   public final boolean isTypography() {
/* 29 */     return (this == TYPOGRAPHY);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemCategory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */