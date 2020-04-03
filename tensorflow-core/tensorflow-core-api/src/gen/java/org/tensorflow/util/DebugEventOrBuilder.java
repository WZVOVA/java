// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.util;

public interface DebugEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DebugEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp in seconds (with microsecond precision).
   * </pre>
   *
   * <code>double wall_time = 1;</code>
   */
  double getWallTime();

  /**
   * <pre>
   * Step of training (if available).
   * </pre>
   *
   * <code>int64 step = 2;</code>
   */
  long getStep();

  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   */
  boolean hasDebugMetadata();
  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   */
  org.tensorflow.util.DebugMetadata getDebugMetadata();
  /**
   * <pre>
   * Metadata related to this debugging data.
   * </pre>
   *
   * <code>.tensorflow.DebugMetadata debug_metadata = 3;</code>
   */
  org.tensorflow.util.DebugMetadataOrBuilder getDebugMetadataOrBuilder();

  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   */
  boolean hasSourceFile();
  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   */
  org.tensorflow.util.SourceFile getSourceFile();
  /**
   * <pre>
   * The content of a source file.
   * </pre>
   *
   * <code>.tensorflow.SourceFile source_file = 4;</code>
   */
  org.tensorflow.util.SourceFileOrBuilder getSourceFileOrBuilder();

  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   */
  boolean hasStackFrameWithId();
  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   */
  org.tensorflow.util.StackFrameWithId getStackFrameWithId();
  /**
   * <pre>
   * A stack frame (filename, line number and column number, function name and
   * code string) with ID.
   * </pre>
   *
   * <code>.tensorflow.StackFrameWithId stack_frame_with_id = 6;</code>
   */
  org.tensorflow.util.StackFrameWithIdOrBuilder getStackFrameWithIdOrBuilder();

  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   */
  boolean hasGraphOpCreation();
  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   */
  org.tensorflow.util.GraphOpCreation getGraphOpCreation();
  /**
   * <pre>
   * The creation of an op within a graph (e.g., a FuncGraph compiled from
   * a Python function).
   * </pre>
   *
   * <code>.tensorflow.GraphOpCreation graph_op_creation = 7;</code>
   */
  org.tensorflow.util.GraphOpCreationOrBuilder getGraphOpCreationOrBuilder();

  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   */
  boolean hasDebuggedGraph();
  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   */
  org.tensorflow.util.DebuggedGraph getDebuggedGraph();
  /**
   * <pre>
   * Information about a debugged graph.
   * </pre>
   *
   * <code>.tensorflow.DebuggedGraph debugged_graph = 8;</code>
   */
  org.tensorflow.util.DebuggedGraphOrBuilder getDebuggedGraphOrBuilder();

  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   */
  boolean hasExecution();
  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   */
  org.tensorflow.util.Execution getExecution();
  /**
   * <pre>
   * Execution of an op or a Graph (e.g., a tf.function).
   * </pre>
   *
   * <code>.tensorflow.Execution execution = 9;</code>
   */
  org.tensorflow.util.ExecutionOrBuilder getExecutionOrBuilder();

  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   */
  boolean hasGraphExecutionTrace();
  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   */
  org.tensorflow.util.GraphExecutionTrace getGraphExecutionTrace();
  /**
   * <pre>
   * A graph execution trace: Contains information about the intermediate
   * tensors computed during the graph execution.
   * </pre>
   *
   * <code>.tensorflow.GraphExecutionTrace graph_execution_trace = 10;</code>
   */
  org.tensorflow.util.GraphExecutionTraceOrBuilder getGraphExecutionTraceOrBuilder();

  /**
   * <pre>
   * The ID of the graph (i.e., FuncGraph) executed here: applicable only
   * to the execution of a FuncGraph.
   * </pre>
   *
   * <code>string graph_id = 11;</code>
   */
  java.lang.String getGraphId();
  /**
   * <pre>
   * The ID of the graph (i.e., FuncGraph) executed here: applicable only
   * to the execution of a FuncGraph.
   * </pre>
   *
   * <code>string graph_id = 11;</code>
   */
  com.google.protobuf.ByteString
      getGraphIdBytes();

  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   */
  boolean hasDebuggedDevice();
  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   */
  org.tensorflow.util.DebuggedDevice getDebuggedDevice();
  /**
   * <pre>
   * A device on which debugger-instrumented ops and/or tensors reside.
   * </pre>
   *
   * <code>.tensorflow.DebuggedDevice debugged_device = 12;</code>
   */
  org.tensorflow.util.DebuggedDeviceOrBuilder getDebuggedDeviceOrBuilder();

  public org.tensorflow.util.DebugEvent.WhatCase getWhatCase();
}