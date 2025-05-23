/*    */ package ai.grazie.gen.tasks.vcs.mr.moveToNewFile;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
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
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CURRENT_FILE_CONTENT", "NEW_FILE_CONTENT", "NEW_FILE_NAME", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public enum Output
/*    */ {
/* 57 */   CURRENT_FILE_CONTENT("CURRENT_FILE_CONTENT"),
/* 58 */   NEW_FILE_CONTENT("NEW_FILE_CONTENT"),
/* 59 */   NEW_FILE_NAME("NEW_FILE_NAME"); static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String value;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   Output(String value) {
/*    */     this.value = value;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       String[] arrayOfString = new String[3];
/*    */       arrayOfString[0] = "CURRENT_FILE_CONTENT";
/*    */       arrayOfString[1] = "NEW_FILE_CONTENT";
/*    */       arrayOfString[2] = "NEW_FILE_NAME";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[3][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.vcs.mr.moveToNewFile.VcsMoveToNewFileTaskParams.Output", (Enum[])VcsMoveToNewFileTaskParams.Output.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<VcsMoveToNewFileTaskParams.Output> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getValue() {
/*    */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\mr\moveToNewFile\VcsMoveToNewFileTaskParams$Output.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */