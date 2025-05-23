/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.ArgumentType;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\026\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\b¢\006\004\b\n\020\013J\006\020\024\032\0020\003J\006\020\025\032\0020\003J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\bHÆ\003J\t\020\032\032\0020\bHÆ\003J;\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bHÆ\001J\023\020\034\032\0020\b2\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001J\t\020 \032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\020\020\rR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\021\020\022R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\023\020\022¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "", "name", "", "type", "Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "desc", "optional", "", "quoted", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;ZZ)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "getDesc", "getOptional", "()Z", "getQuoted", "full", "short", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ej-core"})
/*    */ public final class Argument
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final ArgumentType type;
/*    */   @NotNull
/*    */   private final String desc;
/*    */   private final boolean optional;
/*    */   private final boolean quoted;
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArgumentType getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDesc() {
/*    */     return this.desc;
/*    */   }
/*    */   
/*    */   public final boolean getOptional() {
/*    */     return this.optional;
/*    */   }
/*    */   
/*    */   public Argument(@NotNull String name, @NotNull ArgumentType type, @NotNull String desc, boolean optional, boolean quoted) {
/* 46 */     this.name = name;
/* 47 */     this.type = type;
/* 48 */     this.desc = desc;
/* 49 */     this.optional = optional;
/* 50 */     this.quoted = quoted; } public final boolean getQuoted() { return this.quoted; }
/*    */   @NotNull
/* 52 */   public final String full() { return "**" + this.name + "** (" + this.type.getTypeName() + ") " + (this.optional ? "[optional]" : "[required]") + ": " + this.desc; } @NotNull
/*    */   public final String short() {
/* 54 */     String formattedName = this.quoted ? ("\"<" + this.name + ">\"") : ("<" + this.name + ">");
/* 55 */     return this.optional ? ("[" + formattedName + "]") : formattedName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArgumentType component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.desc;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.optional;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.quoted;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Argument copy(@NotNull String name, @NotNull ArgumentType type, @NotNull String desc, boolean optional, boolean quoted) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(desc, "desc");
/*    */     return new Argument(name, type, desc, optional, quoted);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Argument(name=" + this.name + ", type=" + this.type + ", desc=" + this.desc + ", optional=" + this.optional + ", quoted=" + this.quoted + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.desc.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.optional);
/*    */     return result * 31 + Boolean.hashCode(this.quoted);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Argument))
/*    */       return false; 
/*    */     Argument argument = (Argument)other;
/*    */     return !Intrinsics.areEqual(this.name, argument.name) ? false : ((this.type != argument.type) ? false : (!Intrinsics.areEqual(this.desc, argument.desc) ? false : ((this.optional != argument.optional) ? false : (!(this.quoted != argument.quoted)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\Argument.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */