/*    */ package org.jetbrains.compose.resources.plural;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\002\030\000 \t2\b\022\004\022\0020\0000\001:\001\tB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\n"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralCategory;", "", "(Ljava/lang/String;I)V", "ZERO", "ONE", "TWO", "FEW", "MANY", "OTHER", "Companion", "library"})
/*    */ public enum PluralCategory {
/* 12 */   ZERO,
/* 13 */   ONE,
/* 14 */   TWO,
/* 15 */   FEW,
/* 16 */   MANY,
/* 17 */   OTHER; static { Companion = new Companion(null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<PluralCategory> getEntries() {
/*    */     return $ENTRIES;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralCategory$Companion;", "", "()V", "fromString", "Lorg/jetbrains/compose/resources/plural/PluralCategory;", "name", "", "library"})
/*    */   @SourceDebugExtension({"SMAP\nPluralCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralCategory.kt\norg/jetbrains/compose/resources/plural/PluralCategory$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n288#2,2:28\n*S KotlinDebug\n*F\n+ 1 PluralCategory.kt\norg/jetbrains/compose/resources/plural/PluralCategory$Companion\n*L\n21#1:28,2\n*E\n"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @Nullable
/*    */     public final PluralCategory fromString(@NotNull String name) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'name'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic getEntries : ()Lkotlin/enums/EnumEntries;
/*    */       //   9: checkcast java/lang/Iterable
/*    */       //   12: astore_2
/*    */       //   13: iconst_0
/*    */       //   14: istore_3
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   21: astore #4
/*    */       //   23: aload #4
/*    */       //   25: invokeinterface hasNext : ()Z
/*    */       //   30: ifeq -> 70
/*    */       //   33: aload #4
/*    */       //   35: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   40: astore #5
/*    */       //   42: aload #5
/*    */       //   44: checkcast org/jetbrains/compose/resources/plural/PluralCategory
/*    */       //   47: astore #6
/*    */       //   49: iconst_0
/*    */       //   50: istore #7
/*    */       //   52: aload #6
/*    */       //   54: invokevirtual name : ()Ljava/lang/String;
/*    */       //   57: aload_1
/*    */       //   58: iconst_1
/*    */       //   59: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*    */       //   62: ifeq -> 23
/*    */       //   65: aload #5
/*    */       //   67: goto -> 71
/*    */       //   70: aconst_null
/*    */       //   71: checkcast org/jetbrains/compose/resources/plural/PluralCategory
/*    */       //   74: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #21	-> 6
/*    */       //   #28	-> 15
/*    */       //   #22	-> 52
/*    */       //   #28	-> 62
/*    */       //   #29	-> 70
/*    */       //   #21	-> 74
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   52	10	7	$i$a$-firstOrNull-PluralCategory$Companion$fromString$1	I
/*    */       //   49	13	6	it	Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*    */       //   42	28	5	element$iv	Ljava/lang/Object;
/*    */       //   15	56	3	$i$f$firstOrNull	I
/*    */       //   13	58	2	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */       //   0	75	0	this	Lorg/jetbrains/compose/resources/plural/PluralCategory$Companion;
/*    */       //   0	75	1	name	Ljava/lang/String;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\plural\PluralCategory.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */