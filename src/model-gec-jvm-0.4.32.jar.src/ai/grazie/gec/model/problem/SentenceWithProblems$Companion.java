/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.SentenceWithCorrections;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\"\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\0042\006\020\b\032\0020\tJ)\020\n\032\b\022\004\022\0020\0050\0132\f\020\006\032\b\022\004\022\0020\0070\0132\006\020\b\032\0020\tH\007¢\006\002\020\fJ\026\020\r\032\0020\0052\006\020\b\032\0020\t2\006\020\016\032\0020\017J\017\020\020\032\b\022\004\022\0020\0050\021HÆ\001¨\006\022"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems$Companion;", "", "()V", "allEmpty", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentences", "", "language", "Lai/grazie/nlp/langs/Language;", "empty", "", "([Ljava/lang/String;Lai/grazie/nlp/langs/Language;)[Lai/grazie/gec/model/problem/SentenceWithProblems;", "of", "corrections", "Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithProblems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n11158#2:67\n11493#2,3:68\n11158#2:79\n11493#2,3:80\n37#3:71\n36#3,3:72\n37#3:83\n36#3,3:84\n1557#4:75\n1628#4,3:76\n*S KotlinDebug\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n*L\n33#1:67\n33#1:68,3\n41#1:79\n41#1:80,3\n33#1:71\n33#1:72,3\n44#1:83\n44#1:84,3\n37#1:75\n37#1:76,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<SentenceWithProblems> serializer() {
/* 30 */     return (KSerializer<SentenceWithProblems>)SentenceWithProblems.$serializer.INSTANCE;
/*    */   } @Deprecated(message = "Use allEmpty", replaceWith = @ReplaceWith(expression = "allEmpty", imports = {}))
/*    */   @NotNull
/* 33 */   public final SentenceWithProblems[] empty(@NotNull String[] sentences, @NotNull Language language) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Intrinsics.checkNotNullParameter(language, "language"); String[] arrayOfString1 = sentences; int $i$f$map = 0;
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
/* 67 */     String[] arrayOfString2 = arrayOfString1; Collection<SentenceWithProblems> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 68 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object item$iv$iv = arrayOfString2[b];
/* 69 */       Object object1 = item$iv$iv; Collection<SentenceWithProblems> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$empty$1 = 0; collection.add(new SentenceWithProblems((String)object1, language, new Problem[0])); }
/* 70 */      List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 72 */     Collection thisCollection$iv = list;
/*    */     
/* 74 */     return (SentenceWithProblems[])thisCollection$iv.toArray((Object[])new SentenceWithProblems[0]); } @NotNull public final List<SentenceWithProblems> allEmpty(@NotNull List sentences, @NotNull Language language) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Intrinsics.checkNotNullParameter(language, "language"); Iterable $this$map$iv = sentences; int $i$f$map = 0;
/* 75 */     Iterable iterable1 = $this$map$iv; Collection<SentenceWithProblems> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 76 */     for (Object item$iv$iv : iterable1) {
/* 77 */       String str = (String)item$iv$iv; Collection<SentenceWithProblems> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$allEmpty$1 = 0; collection.add(new SentenceWithProblems(str, language, new Problem[0]));
/* 78 */     }  return (List<SentenceWithProblems>)destination$iv$iv; } @NotNull public final SentenceWithProblems of(@NotNull Language language, @NotNull SentenceWithCorrections corrections) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(corrections, "corrections"); SentenceWithCorrections.Correction[] arrayOfCorrection1 = corrections.getCorrections(); int $i$f$map = 0;
/* 79 */     SentenceWithCorrections.Correction[] arrayOfCorrection2 = arrayOfCorrection1; Collection<Problem> destination$iv$iv = new ArrayList(arrayOfCorrection1.length); int $i$f$mapTo = 0; byte b; int i;
/* 80 */     for (b = 0, i = arrayOfCorrection2.length; b < i; ) { Object item$iv$iv = arrayOfCorrection2[b];
/* 81 */       Object object1 = item$iv$iv; Collection<Problem> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$of$problems$1 = 0; collection.add(Problem.Companion.of((SentenceWithCorrections.Correction)object1)); }
/* 82 */      List problems = (List)destination$iv$iv; Collection $this$toTypedArray$iv = problems;
/*    */     int $i$f$toTypedArray = 0;
/* 84 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 86 */     return new SentenceWithProblems(corrections.getText(), language, (Problem[])thisCollection$iv.toArray((Object[])new Problem[0])); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\SentenceWithProblems$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */