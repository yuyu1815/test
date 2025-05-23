/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import ai.grazie.gec.model.SentenceWithCorrections;
/*     */ import ai.grazie.text.TextRange;
/*     */ import ai.grazie.utils.attributes.StringProperties;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Companion;", "", "()V", "of", "Lai/grazie/gec/model/problem/Problem;", "correction", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,163:1\n11158#2:164\n11493#2,3:165\n37#3:168\n36#3,3:169\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n*L\n72#1:164\n72#1:165,3\n74#1:168\n74#1:169,3\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<Problem> serializer() {
/*  63 */     return (KSerializer<Problem>)Problem.$serializer.INSTANCE; } @NotNull
/*     */   public final Problem of(@NotNull SentenceWithCorrections.Correction correction) {
/*  65 */     Intrinsics.checkNotNullParameter(correction, "correction");
/*     */ 
/*     */ 
/*     */     
/*  69 */     TextRange[] arrayOfTextRange = new TextRange[1]; arrayOfTextRange[0] = correction.getUnderlineRange();
/*     */ 
/*     */     
/*  72 */     String[] arrayOfString1 = correction.getReplacements(); ProblemHighlighting problemHighlighting1 = new ProblemHighlighting(arrayOfTextRange, new TextRange[0]); String str1 = correction.getMessage(); Problem.KindInfo kindInfo1 = new Problem.KindInfo(ProblemKindID.Companion.getLegacy(), Category.OTHER, correction.getService(), "legacy", null, null, 48, null); int $i$f$map = 0;
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
/* 164 */     String[] arrayOfString2 = arrayOfString1; Collection<ProblemFix> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b1; int i;
/* 165 */     for (b1 = 0, i = arrayOfString2.length; b1 < i; ) { Object item$iv$iv = arrayOfString2[b1];
/* 166 */       Object object1 = item$iv$iv; Collection<ProblemFix> collection = destination$iv$iv; int $i$a$-map-Problem$Companion$of$1 = 0; ProblemFix.Part[] arrayOfPart = new ProblemFix.Part[1]; arrayOfPart[0] = new ProblemFix.Part.Change(correction.getErrorRange(), (String)object1); collection.add(new ProblemFix(arrayOfPart, null, null, 6, null)); }
/* 167 */      List list2 = (List)destination$iv$iv, list1 = list2;
/*     */     int $i$f$toTypedArray = 0;
/* 169 */     Collection thisCollection$iv = list1; DefaultConstructorMarker defaultConstructorMarker = null; byte b2 = 64; ActionSuggestion[] arrayOfActionSuggestion = null;
/*     */     StringProperties stringProperties1 = null, stringProperties2 = null;
/* 171 */     ProblemFix[] arrayOfProblemFix = (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]);
/*     */     ProblemHighlighting problemHighlighting2 = problemHighlighting1;
/*     */     String str2 = str1;
/*     */     Problem.KindInfo kindInfo2 = kindInfo1;
/*     */     return new Problem(kindInfo2, str2, problemHighlighting2, arrayOfProblemFix, stringProperties2, stringProperties1, arrayOfActionSuggestion, b2, defaultConstructorMarker);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\Problem$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */