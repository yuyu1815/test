/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\001H\002\032\n\020\000\032\0020\002*\0020\002¨\006\003"}, d2 = {"toLegacy", "Lai/grazie/gec/model/problem/Category;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/ProblemKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,163:1\n12567#2,2:164\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/ProblemKt\n*L\n159#1:164,2\n*E\n"})
/*     */ public final class ProblemKt
/*     */ {
/*     */   private static final Category toLegacy(Category $this$toLegacy) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual isStyle : ()Z
/*     */     //   4: ifeq -> 11
/*     */     //   7: getstatic ai/grazie/gec/model/problem/Category.STYLE : Lai/grazie/gec/model/problem/Category;
/*     */     //   10: areturn
/*     */     //   11: invokestatic values : ()[Lai/grazie/gec/model/problem/ProblemCategory;
/*     */     //   14: astore_1
/*     */     //   15: iconst_0
/*     */     //   16: istore_2
/*     */     //   17: iconst_0
/*     */     //   18: istore_3
/*     */     //   19: aload_1
/*     */     //   20: arraylength
/*     */     //   21: istore #4
/*     */     //   23: iload_3
/*     */     //   24: iload #4
/*     */     //   26: if_icmpge -> 66
/*     */     //   29: aload_1
/*     */     //   30: iload_3
/*     */     //   31: aaload
/*     */     //   32: astore #5
/*     */     //   34: aload #5
/*     */     //   36: astore #6
/*     */     //   38: iconst_0
/*     */     //   39: istore #7
/*     */     //   41: aload #6
/*     */     //   43: invokevirtual name : ()Ljava/lang/String;
/*     */     //   46: aload_0
/*     */     //   47: invokevirtual name : ()Ljava/lang/String;
/*     */     //   50: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   53: ifeq -> 60
/*     */     //   56: iconst_1
/*     */     //   57: goto -> 67
/*     */     //   60: iinc #3, 1
/*     */     //   63: goto -> 23
/*     */     //   66: iconst_0
/*     */     //   67: ifeq -> 74
/*     */     //   70: aload_0
/*     */     //   71: goto -> 77
/*     */     //   74: getstatic ai/grazie/gec/model/problem/Category.OTHER : Lai/grazie/gec/model/problem/Category;
/*     */     //   77: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #154	-> 0
/*     */     //   #155	-> 7
/*     */     //   #159	-> 11
/*     */     //   #164	-> 17
/*     */     //   #159	-> 41
/*     */     //   #164	-> 53
/*     */     //   #165	-> 66
/*     */     //   #159	-> 67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   41	12	7	$i$a$-any-ProblemKt$toLegacy$1	I
/*     */     //   38	15	6	it	Lai/grazie/gec/model/problem/ProblemCategory;
/*     */     //   34	26	5	element$iv	Ljava/lang/Object;
/*     */     //   17	50	2	$i$f$any	I
/*     */     //   15	52	1	$this$any$iv	[Ljava/lang/Object;
/*     */     //   0	78	0	$this$toLegacy	Lai/grazie/gec/model/problem/Category;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Problem.KindInfo toLegacy(@NotNull Problem.KindInfo $this$toLegacy) {
/* 162 */     Intrinsics.checkNotNullParameter($this$toLegacy, "<this>"); return Problem.KindInfo.copy$default($this$toLegacy, null, toLegacy($this$toLegacy.getCategory()), null, null, null, null, 61, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */