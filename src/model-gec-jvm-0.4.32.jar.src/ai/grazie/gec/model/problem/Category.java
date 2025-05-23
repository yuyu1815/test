/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.utils.StringValueClassSerializer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable(with = Category.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\013\n\002\b\021\b\001\030\000 \0232\b\022\004\022\0020\0000\001:\002\023\024B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\0048F¢\006\006\032\004\b\003\020\005R\021\020\006\032\0020\0048F¢\006\006\032\004\b\006\020\005R\021\020\007\032\0020\0048F¢\006\006\032\004\b\007\020\005j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022¨\006\025"}, d2 = {"Lai/grazie/gec/model/problem/Category;", "", "(Ljava/lang/String;I)V", "isSpelling", "", "()Z", "isStyle", "isTypography", "SPELLING", "PUNCTUATION", "TYPOGRAPHY", "GRAMMAR", "SEMANTICS", "STYLE", "READABILITY", "INCLUSIVITY", "TONE", "FORMALITY", "OTHER", "Companion", "Serializer", "model-gec"})
/*    */ public enum Category
/*    */ {
/* 20 */   SPELLING,
/* 21 */   PUNCTUATION,
/* 22 */   TYPOGRAPHY,
/* 23 */   GRAMMAR,
/* 24 */   SEMANTICS,
/* 25 */   STYLE,
/* 26 */   READABILITY,
/* 27 */   INCLUSIVITY,
/* 28 */   TONE,
/* 29 */   FORMALITY,
/* 30 */   OTHER; @NotNull public static final Companion Companion; static { Companion = new Companion(null); }
/*    */   
/*    */   public final boolean isSpelling() {
/* 33 */     return (this == SPELLING);
/*    */   }
/*    */   public final boolean isStyle() {
/* 36 */     return (this == STYLE || this == TONE || this == READABILITY || this == INCLUSIVITY || this == FORMALITY);
/*    */   }
/*    */   
/* 39 */   public final boolean isTypography() { return (this == TYPOGRAPHY); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/gec/model/problem/Category$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/gec/model/problem/Category;", "()V", "model-gec"})
/*    */   public static final class Serializer extends StringValueClassSerializer<Category> {
/* 41 */     private Serializer() { super("Category", null.INSTANCE, null.INSTANCE); } @NotNull public static final Serializer INSTANCE = new Serializer(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/problem/Category$Companion;", "", "()V", "decode", "Lai/grazie/gec/model/problem/Category;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Category.kt\nai/grazie/gec/model/problem/Category$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,47:1\n1310#2,2:48\n*S KotlinDebug\n*F\n+ 1 Category.kt\nai/grazie/gec/model/problem/Category$Companion\n*L\n44#1:48,2\n*E\n"})
/*    */   public static final class Companion { @NotNull
/* 43 */     public final KSerializer<Category> serializer() { return (KSerializer<Category>)Category.Serializer.INSTANCE; }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Category decode(@NotNull String value) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'value'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic values : ()[Lai/grazie/gec/model/problem/Category;
/*    */       //   9: astore_2
/*    */       //   10: iconst_0
/*    */       //   11: istore_3
/*    */       //   12: iconst_0
/*    */       //   13: istore #4
/*    */       //   15: aload_2
/*    */       //   16: arraylength
/*    */       //   17: istore #5
/*    */       //   19: iload #4
/*    */       //   21: iload #5
/*    */       //   23: if_icmpge -> 62
/*    */       //   26: aload_2
/*    */       //   27: iload #4
/*    */       //   29: aaload
/*    */       //   30: astore #6
/*    */       //   32: aload #6
/*    */       //   34: astore #7
/*    */       //   36: iconst_0
/*    */       //   37: istore #8
/*    */       //   39: aload #7
/*    */       //   41: invokevirtual name : ()Ljava/lang/String;
/*    */       //   44: aload_1
/*    */       //   45: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   48: ifeq -> 56
/*    */       //   51: aload #6
/*    */       //   53: goto -> 63
/*    */       //   56: iinc #4, 1
/*    */       //   59: goto -> 19
/*    */       //   62: aconst_null
/*    */       //   63: dup
/*    */       //   64: ifnonnull -> 71
/*    */       //   67: pop
/*    */       //   68: getstatic ai/grazie/gec/model/problem/Category.OTHER : Lai/grazie/gec/model/problem/Category;
/*    */       //   71: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #44	-> 6
/*    */       //   #48	-> 12
/*    */       //   #44	-> 39
/*    */       //   #48	-> 48
/*    */       //   #49	-> 62
/*    */       //   #44	-> 63
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   39	9	8	$i$a$-firstOrNull-Category$Companion$decode$1	I
/*    */       //   36	12	7	it	Lai/grazie/gec/model/problem/Category;
/*    */       //   32	24	6	element$iv	Ljava/lang/Object;
/*    */       //   12	51	3	$i$f$firstOrNull	I
/*    */       //   10	53	2	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */       //   0	72	0	this	Lai/grazie/gec/model/problem/Category$Companion;
/*    */       //   0	72	1	value	Ljava/lang/String;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\Category.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */