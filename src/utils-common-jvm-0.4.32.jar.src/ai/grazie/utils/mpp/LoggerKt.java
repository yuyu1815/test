/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\026\020\000\032\0020\001*\0020\0022\n\020\003\032\006\022\002\b\0030\004¨\006\005"}, d2 = {"create", "Lai/grazie/utils/mpp/MPPLogger;", "Lai/grazie/utils/mpp/LoggerFactory;", "klass", "Lkotlin/reflect/KClass;", "utils-common"})
/*    */ public final class LoggerKt
/*    */ {
/*    */   @NotNull
/*    */   public static final MPPLogger create(@NotNull LoggerFactory $this$create, @NotNull KClass klass) {
/* 48 */     Intrinsics.checkNotNullParameter($this$create, "<this>"); Intrinsics.checkNotNullParameter(klass, "klass"); Intrinsics.checkNotNull(klass.getQualifiedName()); return LoggerFactory.INSTANCE.create(klass.getQualifiedName());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\LoggerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */