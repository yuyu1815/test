/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @JsonDeserialize(using = MessageContentDeserializer.class)
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "", "<init>", "()V", "Plain", "Options", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Options;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Plain;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public abstract class VelocityModelSingleMessageContent
/*    */ {
/*    */   private VelocityModelSingleMessageContent() {}
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Plain;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */   public static final class Plain
/*    */     extends VelocityModelSingleMessageContent
/*    */   {
/*    */     @NotNull
/*    */     private final String value;
/*    */     
/*    */     public Plain(@NotNull String value) {
/* 38 */       super(null); this.value = value; } @NotNull public final String getValue() { return this.value; } @NotNull public final String component1() { return this.value; } @NotNull public final Plain copy(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return new Plain(value); } @NotNull public String toString() { return "Plain(value=" + this.value + ")"; } public int hashCode() { return this.value.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Plain)) return false;  Plain plain = (Plain)other; return !!Intrinsics.areEqual(this.value, plain.value); } }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\0002\0020\001:\001\023B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\024"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Options;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "options", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Options$Option;", "<init>", "(Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Option", "tasks-provider-llm-prompt-velocity-model"}) public static final class Options extends VelocityModelSingleMessageContent { @NotNull private final List<Option> options;
/* 40 */     public Options(@NotNull List<Option> options) { super(null); this.options = options; } @NotNull public final List<Option> getOptions() { return this.options; } @NotNull public final List<Option> component1() { return this.options; } @NotNull public final Options copy(@NotNull List<Option> options) { Intrinsics.checkNotNullParameter(options, "options"); return new Options(options); } @NotNull public String toString() { return "Options(options=" + this.options + ")"; } public int hashCode() { return this.options.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Options)) return false;  Options options = (Options)other; return !!Intrinsics.areEqual(this.options, options.options); } @JsonDeserialize(using = OptionSerializer.class) @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Options$Option;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"}) public static final class Option
/*    */     {
/* 42 */       public Option(@NotNull String value) { this.value = value; } @NotNull private final String value; @NotNull public final String getValue() { return this.value; }
/*    */ 
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.value;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Option copy(@NotNull String value) {
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         return new Option(value);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Option(value=" + this.value + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.value.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Option))
/*    */           return false; 
/*    */         Option option = (Option)other;
/*    */         return !!Intrinsics.areEqual(this.value, option.value);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelSingleMessageContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */