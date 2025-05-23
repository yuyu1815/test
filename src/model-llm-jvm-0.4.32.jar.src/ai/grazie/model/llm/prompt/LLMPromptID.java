/*    */ package ai.grazie.model.llm.prompt;
/*    */ 
/*    */ import ai.grazie.utils.StringValueClassSerializer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable(with = LLMPromptID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\b\030\000 \0172\0020\001:\002\017\020B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\b\020\016\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/llm/prompt/LLMPromptID;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "model-llm"})
/*    */ public final class LLMPromptID {
/* 16 */   public LLMPromptID(@NotNull String id) { this.id = id; } @NotNull public final String getId() { return this.id; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\017"}, d2 = {"Lai/grazie/model/llm/prompt/LLMPromptID$Companion;", "", "()V", "LEGACY", "Lai/grazie/model/llm/prompt/LLMPromptID;", "getLEGACY", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "TASK", "getTASK", "TEST", "getTEST", "UNKNOWN", "getUNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull
/* 17 */     public final KSerializer<LLMPromptID> serializer() { return (KSerializer<LLMPromptID>)LLMPromptID.Serializer.INSTANCE; } @NotNull
/* 18 */     public final LLMPromptID getTASK() { return LLMPromptID.TASK; } @NotNull
/* 19 */     public final LLMPromptID getTEST() { return LLMPromptID.TEST; } @NotNull
/* 20 */     public final LLMPromptID getUNKNOWN() { return LLMPromptID.UNKNOWN; } @NotNull
/* 21 */     public final LLMPromptID getLEGACY() { return LLMPromptID.LEGACY; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String id; @NotNull private static final LLMPromptID LEGACY = new LLMPromptID("legacy"); @NotNull private static final LLMPromptID TASK = new LLMPromptID("task"); @NotNull
/*    */   private static final LLMPromptID TEST = new LLMPromptID("test"); @NotNull
/*    */   private static final LLMPromptID UNKNOWN = new LLMPromptID("unknown"); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/llm/prompt/LLMPromptID$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/llm/prompt/LLMPromptID;", "()V", "model-llm"})
/* 24 */   public static final class Serializer extends StringValueClassSerializer<LLMPromptID> { private Serializer() { super("LLMPromptID", null.INSTANCE, null.INSTANCE); } @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); } @NotNull
/* 26 */   public String toString() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMPromptID copy(@NotNull String id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return new LLMPromptID(id);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.id.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMPromptID))
/*    */       return false; 
/*    */     LLMPromptID lLMPromptID = (LLMPromptID)other;
/*    */     return !!Intrinsics.areEqual(this.id, lLMPromptID.id);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\prompt\LLMPromptID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */