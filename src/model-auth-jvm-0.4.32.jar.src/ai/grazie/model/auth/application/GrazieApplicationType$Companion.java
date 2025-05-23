/*    */ package ai.grazie.model.auth.application;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/auth/application/GrazieApplicationType$Companion;", "", "()V", "of", "Lai/grazie/model/auth/application/GrazieApplicationType;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-auth"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieApplicationType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieApplicationType.kt\nai/grazie/model/auth/application/GrazieApplicationType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<GrazieApplicationType> serializer() {
/* 15 */     return get$cachedSerializer();
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */   
/*    */   @Nullable
/*    */   public final GrazieApplicationType of(@NotNull String id) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'id'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: invokestatic values : ()[Lai/grazie/model/auth/application/GrazieApplicationType;
/*    */     //   9: astore_2
/*    */     //   10: iconst_0
/*    */     //   11: istore_3
/*    */     //   12: aload_2
/*    */     //   13: arraylength
/*    */     //   14: istore #4
/*    */     //   16: iload_3
/*    */     //   17: iload #4
/*    */     //   19: if_icmpge -> 69
/*    */     //   22: aload_2
/*    */     //   23: iload_3
/*    */     //   24: aaload
/*    */     //   25: astore #5
/*    */     //   27: aload #5
/*    */     //   29: astore #6
/*    */     //   31: iconst_0
/*    */     //   32: istore #7
/*    */     //   34: aload #6
/*    */     //   36: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   39: aload_1
/*    */     //   40: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   43: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   46: dup
/*    */     //   47: ldc 'toLowerCase(...)'
/*    */     //   49: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   52: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   55: ifeq -> 63
/*    */     //   58: aload #5
/*    */     //   60: goto -> 70
/*    */     //   63: iinc #3, 1
/*    */     //   66: goto -> 16
/*    */     //   69: aconst_null
/*    */     //   70: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 6
/*    */     //   #20	-> 31
/*    */     //   #16	-> 34
/*    */     //   #16	-> 52
/*    */     //   #16	-> 55
/*    */     //   #16	-> 70
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   34	21	7	$i$a$-find-GrazieApplicationType$Companion$of$1	I
/*    */     //   31	24	6	it	Lai/grazie/model/auth/application/GrazieApplicationType;
/*    */     //   0	71	0	this	Lai/grazie/model/auth/application/GrazieApplicationType$Companion;
/*    */     //   0	71	1	id	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\application\GrazieApplicationType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */