/*    */ package ai.grazie.ner.model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\004¢\006\002\020\bJ\017\020\t\032\b\022\004\022\0020\0050\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/ner/model/SentenceWithNERAnnotations$Companion;", "", "()V", "empty", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentences", "", "([Ljava/lang/String;)[Lai/grazie/ner/model/SentenceWithNERAnnotations;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-ner"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithNERAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithNERAnnotations.kt\nai/grazie/ner/model/SentenceWithNERAnnotations$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,76:1\n11158#2:77\n11493#2,3:78\n37#3:81\n36#3,3:82\n*S KotlinDebug\n*F\n+ 1 SentenceWithNERAnnotations.kt\nai/grazie/ner/model/SentenceWithNERAnnotations$Companion\n*L\n53#1:77\n53#1:78,3\n53#1:81\n53#1:82,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<SentenceWithNERAnnotations> serializer() {
/* 51 */     return (KSerializer<SentenceWithNERAnnotations>)SentenceWithNERAnnotations.$serializer.INSTANCE; } @NotNull
/*    */   public final SentenceWithNERAnnotations[] empty(@NotNull String[] sentences) {
/* 53 */     Intrinsics.checkNotNullParameter(sentences, "sentences"); String[] arrayOfString1 = sentences; int $i$f$map = 0;
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
/* 77 */     String[] arrayOfString2 = arrayOfString1; Collection<SentenceWithNERAnnotations> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 78 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object item$iv$iv = arrayOfString2[b];
/* 79 */       Object object1 = item$iv$iv; Collection<SentenceWithNERAnnotations> collection = destination$iv$iv; int $i$a$-map-SentenceWithNERAnnotations$Companion$empty$1 = 0; collection.add(new SentenceWithNERAnnotations((String)object1, new SentenceWithNERAnnotations.Annotation[0])); }
/* 80 */      List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 82 */     Collection thisCollection$iv = list;
/*    */     
/* 84 */     return (SentenceWithNERAnnotations[])thisCollection$iv.toArray((Object[])new SentenceWithNERAnnotations[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\model\SentenceWithNERAnnotations$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */